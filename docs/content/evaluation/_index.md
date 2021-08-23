---
title: 📝 Evaluation of the approach (APIzator)
---

# 💾 Creating the collection of APIs from *StackOverflow*

This section contains all the data we used to evaluate our approach called *APIzator*.
We collected a large sample of *StackOverflow* posts regarding questions on *Java* and run our tool *APIzator* to automatically generate *APIzations*.
We release the full collection of generated *APIzations* that developers can compile and run.
A sample of the *APIzations* is available through our [search engine](/search), where you can easily search and compare with the original snippets.

## Process

The following table shows the steps of our processing method to collect of APIs data.

<div class="table-wrapper">

Step | Description | Questions | Answers | Snippets | APIzator-APIs | Human-APIs | Data
---: | --- | --- | --- | --- | --- | --- | ---
[1](#1) | *StackOverflow* archive | – | – | – | – | – | –
[2](#2) | Filter suitable content | `1,014,980` | `1,730,251` | – | – | – | [`so_answers.jsonl.xz.part.000`][so_answers.jsonl.xz.part.000] <br /> [`so_answers.jsonl.xz.part.001`][so_answers.jsonl.xz.part.001] <br /> [`so_answers.jsonl.xz.part.002`][so_answers.jsonl.xz.part.002] <br /> [`so_answers.jsonl.xz.part.003`][so_answers.jsonl.xz.part.003] <hr /> [`so_questions.jsonl.xz.part.000`][so_questions.jsonl.xz.part.000] <br /> [`so_questions.jsonl.xz.part.001`][so_questions.jsonl.xz.part.001] <br /> [`so_questions.jsonl.xz.part.002`][so_questions.jsonl.xz.part.002] <br /> [`so_questions.jsonl.xz.part.003`][so_questions.jsonl.xz.part.003]
[3](#3) | Make the snippets compilable | `107,536` | `141,064` | `141,064` | – | – | [`external_libraries_jars.tar.xz.part.000`][external_libraries_jars.tar.xz.part.000] <br /> [`external_libraries_jars.tar.xz.part.001`][external_libraries_jars.tar.xz.part.001] <br /> [`external_libraries_jars.tar.xz.part.002`][external_libraries_jars.tar.xz.part.002] <br /> [`external_libraries_jars.tar.xz.part.003`][external_libraries_jars.tar.xz.part.003] <br /> [`external_libraries_jars.tar.xz.part.004`][external_libraries_jars.tar.xz.part.004] <hr /> [`compilable_snippets.tar.xz`][compilable_snippets.tar.xz]
[4](#4) | *APIzator* processing | `84,267` | `109,930` | `109,930` | `109,930` | – | [`apizations.tar.xz`][apizations.tar.xz]

</div>

### 1. *StackOverflow* archive {#1}

We started from the *StackOverflow* archive on [The Internet Archive](https://archive.org/details/stackexchange) with the dump of `May, 2019`.

### 2. Filter suitable content {#2}

Starting from the large dump of *StackOverflow*, we filtered and extracted only questions tagged with *Java*.
Then, we extracted the answers with at least one code snippet, defined by the HTML tags `<pre><code>`.

We produced the files:

* [`so_answers.jsonl.xz.part.000`][so_answers.jsonl.xz.part.000]
* [`so_answers.jsonl.xz.part.001`][so_answers.jsonl.xz.part.001]
* [`so_answers.jsonl.xz.part.002`][so_answers.jsonl.xz.part.002]
* [`so_answers.jsonl.xz.part.003`][so_answers.jsonl.xz.part.003]

The archive `so_answers.json.xz` file was split into multiple chunks.
You can obtain a single file with the command:

```bash
cat so_answers.jsonl.xz.part.* > so_answers.jsonl.xz
```

We also extracted the related questions.
We produced the files:

* [`so_questions.jsonl.xz.part.000`][so_questions.jsonl.xz.part.000]
* [`so_questions.jsonl.xz.part.001`][so_questions.jsonl.xz.part.001]
* [`so_questions.jsonl.xz.part.002`][so_questions.jsonl.xz.part.002]
* [`so_questions.jsonl.xz.part.003`][so_questions.jsonl.xz.part.003]

### 3. Make the snippets compilable {#3}

We processed the *StackOverflow* posts by using *CSnippEX*.
Considering the large amount of snippets to process, we had to set up an upper limit to make the mining activity feasible.
We set up the processing time at `5` seconds to allow *CSnippEX* to make the snippet compilable and retrieve the possible importing packages.

*CSnippEX* queries the [Maven Repository](https://mvnrepository.com) library search engine, which has indexed around 10 million *Java* libraries.
For each library category, we selected the top three libraries and downloaded their latest version.
We also included the runtime dependencies of these library using the dependency resolver of *Maven*, which gave us a total of `748` `JAR` files.
We publish the final set of `JARs`:

* [`external_libraries_jars.tar.xz.part.000`][external_libraries_jars.tar.xz.part.000]
* [`external_libraries_jars.tar.xz.part.001`][external_libraries_jars.tar.xz.part.001]
* [`external_libraries_jars.tar.xz.part.002`][external_libraries_jars.tar.xz.part.002]
* [`external_libraries_jars.tar.xz.part.003`][external_libraries_jars.tar.xz.part.003]
* [`external_libraries_jars.tar.xz.part.004`][external_libraries_jars.tar.xz.part.004]

As for the *Java* environment, we used the *Java* executables and *JRE* included in the version `jdk-8u171-linux-x64`.

At the end of the process, we obtained `141,064` compilable code snippets, we release as `JSON` files [`compilable_snippets.tar.xz`][compilable_snippets.tar.xz].

### 4. *APIzator* processing {#4}

We used the compilable snippets from the previous step as input for our tool *APIzator*.
Every produced API also includes a method name we generated by a *POS Tagger* *NLP* technique.
We were able to produce `109,930` valid *APIzations*, whose *Java* source files are available in the [`apizations.tar.xz`][apizations.tar.xz] file.

A sample of the *APIzations* is available through our [search engine](/search), where you can easily search and compare with the original snippets.

---

# 🧔 Selecting the APIs for the evaluation

For the evaluation of the approach, we asked human participants to apply the *APIzation* on a subset of the extracted snippets, to constitute the oracle for our study.
In our evaluation study, we compare the automatic generated *APIzations* to those of the oracle.
We release all the snippets, human' and our tool's *APIzations* in the form of browsable pages at the section [comparison](comparison).

## Process

<div class="table-wrapper">

Step | Description | Questions | Answers | Snippets | APIzator-APIs | Human-APIs | Data
---: | --- | --- | --- | --- | --- | --- | ---
[5](#5) | Selecting *APIzations* for evaluation | `8,526` | `9,901` | `9,901` | `9,901` | – | [`evaluation_candidates.csv`][evaluation_candidates.csv]
[6](#6) | Evaluation with human *APIzations* | `200` | `200` | `200` | `200` | `200` | [`evaluation_human_apizations.tar.xz`][evaluation_human_apizations.tar.xz] <hr /> [`evaluation_apizator_apizations.tar.xz`][evaluation_apizator_apizations.tar.xz]

</div>

### 5. Selecting APIzations for evaluation {#5}

To prepare the data for the human evaluation part, starting from the *APIzations* we collected in the previous step, we identified the evaluation set with the following five properties:

* we selected only those *APIzations* belonging to questions in the form of `how *`
* to ensure enough level of quality, we only selected the *APIzations* related to accepted answers or having a score greater or equal to `2`
* we excluded the *APIzations* whose answers on *StackOverflow* presents multiple code blocks
* we removed those *APIzations* for which the associated code snippets already present a well-formed method declaration
* we excluded those *APIzations* that are associated to third-party libraries, other than the JDK, since they could require specific knowledge that human participants might not have.

In total, we collected `9,901` *APIzations*, whose list is included in the file [`evaluation_candidates.csv`][evaluation_candidates.csv].

### 6. Evaluation with human *APIzations* {#6}

We asked `20` human participants to perform a manual *APIzation*, `10` snippets each.
The human participants received an executable script to help them to produce the APIs.
The script instructions are shown in the section [script instructions](script).

We randomly assigned the snippets from the [`evaluation_candidates.csv`][evaluation_candidates.csv] list.
We release the produced *APIzations* in the file [`evaluation_human_apizations.tar.xz`][evaluation_human_apizations.tar.xz].
The set of *APIzations* we compared in the evaluation is released in the file [`evaluation_apizator_apizations.tar.xz`][evaluation_apizator_apizations.tar.xz].

Moreover, we release all the snippets, human' and our tool's *APIzations* in the form of browsable pages at the section [comparison](comparison).

[so_answers.jsonl.xz.part.000]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_answers.jsonl.xz.part.000
[so_answers.jsonl.xz.part.001]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_answers.jsonl.xz.part.001
[so_answers.jsonl.xz.part.002]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_answers.jsonl.xz.part.002
[so_answers.jsonl.xz.part.003]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_answers.jsonl.xz.part.003
[so_questions.jsonl.xz.part.000]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_questions.jsonl.xz.part.000
[so_questions.jsonl.xz.part.001]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_questions.jsonl.xz.part.001
[so_questions.jsonl.xz.part.002]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_questions.jsonl.xz.part.002
[so_questions.jsonl.xz.part.003]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/so_questions.jsonl.xz.part.003

[compilable_snippets.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/compilable_snippets.tar.xz

[external_libraries_jars.tar.xz.part.000]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/external_libraries_jars.tar.xz.part.000
[external_libraries_jars.tar.xz.part.001]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/external_libraries_jars.tar.xz.part.001
[external_libraries_jars.tar.xz.part.002]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/external_libraries_jars.tar.xz.part.002
[external_libraries_jars.tar.xz.part.003]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/external_libraries_jars.tar.xz.part.003
[external_libraries_jars.tar.xz.part.004]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/external_libraries_jars.tar.xz.part.004

[apizations.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/apizations.tar.xz

[evaluation_candidates.csv]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/evaluation_candidates.csv

[evaluation_human_apizations.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/evaluation_human_apizations.tar.xz
[evaluation_apizator_apizations.tar.xz]: https://github.com/pasqualesalza/apization/raw/main/data/evaluation/evaluation_apizator_apizations.tar.xz
