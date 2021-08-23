# APIzation: Generating Reusable APIs from StackOverflow Code Snippets

[![DOI](https://zenodo.org/badge/399110560.svg)](https://zenodo.org/badge/latestdoi/399110560)
[![CC BY 4.0](https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by/4.0/)
[![Netlify Status](https://api.netlify.com/api/v1/badges/d286340c-bfb6-446d-9e05-ef6880c28e9c/deploy-status)](https://app.netlify.com/sites/apization/deploys)

This repository represents the replication package for the paper:

> **APIzation: Generating Reusable APIs from StackOverflow Code Snippets**
>
> Developer forums like StackOverflow have become essential resources to modern software development practices. However, many code snippets lack a well-defined method declaration, and thus they are often incomplete for immediate reuse. Developers must adapt the retrieved code snippets by parameterizing the variables involved and identifying the return value. This activity, which we call APIzation of a code snippet, can be tedious and time-consuming. In this paper, we present APIzator to perform APIzations of Java code snippets automatically. APIzator is grounded by four common patterns that we extracted by studying real APIzations in GitHub. APIzator presents a static analysis algorithm that automatically extracts the method parameters and return statements. We evaluated APIzator with a ground-truth of 200 APIzations collected from 20 developers. For 113 (56.50 %) and 115 (57.50 %) APIzations, APIzator and the developers extracted identical parameters and return statements, respectively. For 163 (81.50 %) APIzations, either the parameters or the return statements were identical.

The paper is published in the proceeding of the *36th IEEE/ACM International Conference on Automated Software Engineering (ASE)*.

In this replication package, we provide all the *APIzations* we produced with our tool.
Also, we include the data we used for our evaluation.

## :open_file_folder: Organization

The repository is organized as follows:

* [`data/`](data/) contains the data of the replication package
  * [`study/`](data/study/) contains all the data we used to conduct our investigatory study to understand how developers perform *APIzations*
  * [`evaluation/`](data/evaluation/) includes everything regarded the evaluation part of our approach called *APIzator*
  * [`search/`](data/search/) provides the *Java* source files for the search engine we produced by using *APIzator*. Refer to the website for a demo
* [`docs/`](docs/) contains the source code for the website where we documented our experiments

## :books: How to cite this dataset

If you would like to cite the dataset, please use the following `BibTeX` snippet:

```bibtex
@inproceedings{terragni_apization_2021,
    author = {Terragni, Valerio and Salza, Pasquale},
    title = {{APIzation: Generating Reusable APIs from StackOverflow Code Snippets}},
    booktitle = {IEEE/ACM International Conference on Automated Software Engineering (ASE)},
    year = {2021},
}
```

## :balance_scale: License

This replication package is licensed under the terms of the [Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/).
Please see the [LICENSE](LICENSE) file for full details.

## :pray: Credits

* [Valerio Terragni](mailto:valerio.terragni@usi.ch) – University of Auckland, New Zealand
* [Pasquale Salza](mailto:salza@ifi.uzh.ch) – University of Zurich, Switzerland
