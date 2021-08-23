---
title: "Homepage"
---

# 🏠 Homepage

This documentation website refers to the replication package for the paper:

> **APIzation: Generating Reusable APIs from StackOverflow Code Snippets**
>
> Developer forums like StackOverflow have become essential resources to modern software development practices. However, many code snippets lack a well-defined method declaration, and thus they are often incomplete for immediate reuse. Developers must adapt the retrieved code snippets by parameterizing the variables involved and identifying the return value. This activity, which we call APIzation of a code snippet, can be tedious and time-consuming. In this paper, we present APIzator to perform APIzations of Java code snippets automatically. APIzator is grounded by four common patterns that we extracted by studying real APIzations in GitHub. APIzator presents a static analysis algorithm that automatically extracts the method parameters and return statements. We evaluated APIzator with a ground-truth of 200 APIzations collected from 20 developers. For 113 (56.50 %) and 115 (57.50 %) APIzations, APIzator and the developers extracted identical parameters and return statements, respectively. For 163 (81.50 %) APIzations, either the parameters or the return statements were identical.

The paper is published in the proceeding of the *36th IEEE/ACM International Conference on Automated Software Engineering (ASE)*.

In this replication package, we provide all the *APIzations* we produced with our tool.
Also, we include the data we used for our evaluation.

The website is organized as follows:

1. [📊 Study on APIzations](study) contains all the data we used to conduct our investigatory study to understand how developers perform *APIzations*.
2. [📝 Evaluation of the approach](evaluation) includes everything regarded the evaluation part of our approach called **APIzator**, and also a [browsable section](evaluation/comparison) to compare the *APIzations* we generated with the ones produced from the human participants.
3. [🔍 Search APIzations](search) provides a search engine for a sample of the *APIzations* we produced by using *APIzator*.

## ⚖ License

This replication package is licensed under the terms of the [Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/).
Please see the [license page](license) for full details.

## 🙏 Credits

* [Valerio Terragni](mailto:valerio.terragni@usi.ch) – University of Auckland, New Zealand
* [Pasquale Salza](mailto:salza@ifi.uzh.ch) – University of Zurich, Switzerland
