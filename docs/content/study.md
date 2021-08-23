---
title: 📊 Study on APIzations
---

This section contains all the data we used to conduct our investigatory study to understand how developers perform *APIzations*.

We collected examples of manual *APIzations* by mining both *GitHub* and *StackOverflow*.
These examples represent such cases in which developers grabbed the snippets from *StackOverflow* and adapted to their own codebase, published in a public repository on *GitHub*.
We only mined those examples on *GitHub* for which an explicit link to a *StackOverflow* is reported as part of the method documentation.

The insights gained from this study led to four common *APIzation* patterns that establish the foundations of our proposed technique.

## Process

The following table shows the steps of our processing method to collect the data for the study.

<div class="table-wrapper">

Step | Description | Files | Questions | Answers | Methods | Snippets | Pairs | Data
---: | --- | --- | --- | --- | --- | --- | --- | ---
[1](#1) | *GitHub* archive | `~1,000,000` | – | – | – | – | – | –
[2](#2) | Filter *Java* files with an explicit link to *StackOverflow* | `57,810` | – | – | – | – | – | [`gh_files.jsonl.xz`][gh_files.jsonl.xz]
[3](#3) | Remove duplicates and links extraction | `29,035` | `11,300` | `4,008` | – | – | – | [`gh_files_cleaned.jsonl.xz`][gh_files_cleaned.jsonl.xz] <br /> [`question_ids.csv`][question_ids.csv] <br /> [`answer_ids.csv`][answer_ids.csv]
[4](#4) | Extract answers text from *StackOverflow* | – | `10,991` | `64,678` | – | – | – | [`so_answers.csv.xz`][so_answers.csv.xz] <br /> [`so_answers_to_questions.csv.xz`][so_answers_to_questions.csv.xz]
[5](#5) | Combine *GitHub* files and *StackOverflow* answers | `27,940` | `13,300` | `63,123` | – | – | – | [`ghso_files_answers.jsonl.xz`][ghso_files_answers.jsonl.xz]
[6](#6) | *Type 3* clone detection | `330` | – | `199` | `330` | `199` | `330` | [`sogh_pairs_clones.json.xz`][sogh_pairs_clones.json.xz]
[7](#7) | Data preparation for manual evaluation | – | – | – | – | – | – | [`sogh_pairs_clones_files.tar.xz`][sogh_pairs_clones_files.tar.xz] <br /> [`sogh_pairs_clones_diffs.tar.xz`][sogh_pairs_clones_diffs.tar.xz]
[8](#8) | Manual selection of APIs | – | – | – | `135` | `85` | `135` | [`sogh_pairs_diffs_apizations.tar.xz`][sogh_pairs_diffs_apizations.tar.xz] <br /> [`sogh_pairs_diffs_different_semantic.tar.xz`][sogh_pairs_diffs_different_semantic.tar.xz] <br /> [`sogh_pairs_diffs_tests.tar.xz`][sogh_pairs_diffs_tests.tar.xz] <br /> [`sogh_pairs_diffs_false_positives.tar.xz`][sogh_pairs_diffs_false_positives.tar.xz]
[9](#9) | Coding patterns | – | – | – | – | – | `135` | [`parameters_patterns_coding.csv`][parameters_patterns_coding.csv] <br /> [`return_patterns_coding.csv`][return_patterns_coding.csv]
[10](#10) | Manual application of the patterns | – | – | – | – | – | `135` | [`parameters_patterns_analysis.csv`][parameters_patterns_analysis.csv] <br /> [`return_patterns_analysis.csv`][return_patterns_analysis.csv]

</div>

### 1. *GitHub* archive {#1}

We started from the *GitHub* archive on [Google BigQuery](https://cloud.google.com/bigquery) with the dump of `May, 2019`.

### 2. Filter *Java* files with an explicit link to *StackOverflow* {#2}

We queried *BigQuery* and extracted those *Java* files having an explicit link to a *StackOverflow* page, `%stackoverflow.com%`.
In particular, we queried the `bigquery-public-data.github_repos.contents` table.
We produced the file [`gh_files.jsonl.xz`][gh_files.jsonl.xz].

### 3. Remove duplicates and links extraction {#3}

We cleaned the data from duplicates and recognized the IDs of *StackOverflow* questions and answers.
We processed [`gh_files.jsonl.xz`][gh_files.jsonl.xz] through a *Python* script that saves the filtered *GitHub* files into [`gh_files_cleaned.jsonl.xz`][gh_files_cleaned.jsonl.xz].
We also created the [`question_ids.csv`][question_ids.csv] and [`answer_ids.csv`][answer_ids.csv] files, which contain the IDs of the linked questions and answers, respectively.
In the case of [`answer_ids.csv`][answer_ids.csv], we found the associated question IDs in the next passages, being an answer ID unique regardless of the question.
It might also happen that a single file has multiple *StackOverflow* links.

### 4. Extract answers text from *StackOverflow* {#4}

We uploaded [`answer_ids.csv`][answer_ids.csv] and [`question_ids.csv`][question_ids.csv] into *BigQuery*.
Then, we ran a query on `bigquery-public-data.stackoverflow.posts_answers` to retrieve the answer posts on the `May, 2019` dump of *StackOverflow*.
The answers IDs correspond to those links in which an answer post was explicitly declared.
For this, we used the IDs belonging to [`answer_ids.csv`][answer_ids.csv].
We saved the results into a CSV file [`so_answers.csv.xz`][so_answers.csv.xz].
Instead, we ran another query to collect all the answer posts related to the questions we extracted from links, using the IDs in [`question_ids.csv`][question_ids.csv].
We saved the results into a CSV file [`so_answers_to_questions.csv.xz`][so_answers_to_questions.csv.xz].
Until this moment, we have the information on all the involved questions and possible answers.

### 5. Combine *GitHub* files and *StackOverflow* answers {#5}

We combined [`gh_files_cleaned.jsonl.xz`][gh_files_cleaned.jsonl.xz] containing the *Java* files, with the answers contained in [`so_answers.csv.xz`][so_answers.csv.xz] and [`so_answers_to_questions.csv.xz`][so_answers_to_questions.csv.xz], using a Python script.
We also removed all the files for which we could not obtain all the required information.
We save the results into the file [`ghso_files_answers.jsonl.xz`][ghso_files_answers.jsonl.xz], which contains for every *GitHub* file all the possible answers.

### 6. *Type 3* clone detection {#6}

We processed [`ghso_files_answers.jsonl.xz`][ghso_files_answers.jsonl.xz] to extract `public` methods from files, only those reporting an explicit link to *StackOverflow* in the documentation/comment.

We converted all the *StackOverflow* possible answer texts into code snippets.
For each links between a method and possible snippets, we created the pairs of `(snippet, method)`.
We also filtered out those snippets with less lines of code than `6`.

Finally, we detected the *type 3* code clones between snippet and method with a `70%` matching threshold.
We saved the results in the [`sogh_pairs_clones.json.xz`][sogh_pairs_clones.json.xz] file.

### 7. Data preparation for manual evaluation {#7}

We prepared the data for manual evaluation.
We parsed [`sogh_pairs_clones.json.xz`][sogh_pairs_clones.json.xz] to prepare a folder for every pair `so#{so_answer_id}_gh#{gh_file_id}`, containing:

1. the `so#{so_answer_id}.java` snippet from *StackOverflow*
2. the `gh#{gh_file_id}.java` matching method code from *GitHub*

We saved all the files into a folder, compressed into the file [`sogh_pairs_clones_files.tar.xz`][sogh_pairs_clones_files.tar.xz].

Then, we created the HTML files, visually showing the differences between the snippet and method, using the *diff* and [*diff2html*](https://diff2html.xyz) utilities.

We saved all the files into a compressed file [`sogh_pairs_clones_diffs.tar.xz`][sogh_pairs_clones_diffs.tar.xz].

### 8. Manual selection of APIs {#8}

We pruned the pairs due to spurious code clones, those snippets that were included into a larger *GitHub* method.
We manually evaluated and classified all the pairs:

* [`sogh_pairs_diffs_apizations.tar.xz`][sogh_pairs_diffs_apizations.tar.xz], the final set of pairs used for the analysis, as examples of valid *APIzations*
* [`sogh_pairs_diffs_different_semantic.tar.xz`][sogh_pairs_diffs_different_semantic.tar.xz], the pairs where the *StackOverflow* snippets were included into more complex methods
* [`sogh_pairs_diffs_tests.tar.xz`][sogh_pairs_diffs_tests.tar.xz], not valid pairs because they are test cases
* [`sogh_pairs_diffs_false_positives.tar.xz`][sogh_pairs_diffs_false_positives.tar.xz], not valid examples of reuse

### 9. Coding patterns {#9}

We manually analyzed the content of the *APIzations* to identify possible patterns.
We followed a coding process inspired by *grounded theory*.
The list of codes is described in the following table.

Type | Code
--- | ---
Parameter | Undeclared variable
Parameter | The variable has a constant value
Return | The variable is the latest statement in the code snippet
Return | The variable is used as an argument in a `System.out.println` invocation

At the end of the coding process, we were able to extract the common patterns then used in our automated approach called *APIzator*.
We provide the results of such manual analysis in the files [`parameters_patterns_coding.csv`][parameters_patterns_coding.csv] and [`return_patterns_coding.csv`][return_patterns_coding.csv], for the parameter and return statements transformations, respectively.
In the provided files, we specify the agreed pattern in the column `code`.

### 10. Manual application of the patterns {#10}

As the final step in our study, we tried to manually apply these patterns to the same examples used for observations.
This is intended to simulate how our automated approach called *APIzator* would behave.
We provide the results of such manual analysis in the files [`parameters_patterns_analysis.csv`][parameters_patterns_analysis.csv] and [`return_patterns_analysis.csv`][return_patterns_analysis.csv], for the parameter and return statements transformations, respectively.

In the provided file, we specified the applied pattern in the column `human_classification`.
We indicated the pattern that would be applied by our approach in the column `apizator_classification`.

The pattern classification is described in the following table.

Classification | Type | Description
--- | --- | ---
*none* | Parameter | The developer did not convert the variable to a parameter.
*custom* | Parameter | The developer applied a transformation by using an arbitrary action we were not able to generalize.
*PATT-notdecl* | Parameter | The developer created a parameter from a variable that is only used, but not declared, in the code snippet.
*PATT-const* | Parameter | The developer transformed a variable with a hard-coded assignment to a parameter.
*none* | Return | There are no return statements in the resulting API.
*already* | Return | The return statement is already declared in the snippet and was not changed by the developer.
*custom* | Return | The developer indicated a return value by using an arbitrary action we were not able to generalize.
*PATT-latest* | Return | The developer derived the return statement as the last assignment to a variable in the snippet.
*PATT-syso* | Return | The developer transformed a print to the system output to the return statement.

[gh_files.jsonl.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/gh_files.jsonl.xz

[gh_files_cleaned.jsonl.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/gh_files_cleaned.jsonl.xz
[question_ids.csv]: https://github.com/pasqualesalza/apization/raw/main/data/study/question_ids.csv
[answer_ids.csv]: https://github.com/pasqualesalza/apization/raw/main/data/study/answer_ids.csv

[so_answers.csv.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/so_answers.csv.xz
[so_answers_to_questions.csv.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/so_answers_to_questions.csv.xz

[ghso_files_answers.jsonl.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/ghso_files_answers.jsonl.xz

[sogh_pairs_clones.json.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_clones.json.xz

[sogh_pairs_clones_files.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_clones_files.tar.xz
[sogh_pairs_clones_diffs.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_clones_diffs.tar.xz

[sogh_pairs_diffs_apizations.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_diffs_apizations.tar.xz
[sogh_pairs_diffs_different_semantic.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_diffs_different_semantic.tar.xz
[sogh_pairs_diffs_tests.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_diffs_tests.tar.xz
[sogh_pairs_diffs_false_positives.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/study/sogh_pairs_diffs_false_positives.tar.xz

[parameters_patterns_coding.csv]: https://github.com/pasqualesalza/apization/raw/main/data/study/parameters_patterns_coding.csv
[return_patterns_coding.csv]: https://github.com/pasqualesalza/apization/raw/main/data/study/return_patterns_coding.csv

[parameters_patterns_analysis.csv]: https://github.com/pasqualesalza/apization/raw/main/data/study/parameters_patterns_analysis.csv
[return_patterns_analysis.csv]: https://github.com/pasqualesalza/apization/raw/main/data/study/return_patterns_analysis.csv
