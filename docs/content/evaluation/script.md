---
title: "📜 Script instructions"
---

We provided an executable script to the human participants to produce the APIs for the ground-truth.

In the following, we show the instructions that the participants received as an example of interaction.

```text
*************************************************
Hello, Thank you for participating at this experiment!
What is the ID assigned to you ?
1
I will start by asking you three questions about yourself
Do you know the Java programming language?
yes
How many years of experience do you have with Java?
10
Do you know the website http://www.stackoverflow.com?
yes

====== BEGINNING INSTRUCTION ======
We will ask you to do manually do the process of APIzation for 10 stackoverflow code snippets
the APIzation consists of taking a code snippet from stackoverflow and transforming it into a compilable Java public and static method with a proper method declaration and return value. 
Moreover, you should also give a meaningful method name

Press Enter key to continue...


===== EXAMPLE OF APIZATION =====
the following stackoverflow code snippet was transformed into the method nextPowOf2 by extracting the variable "v" as a method parameter
and also as return value
________STACKOVERFLOW_____
https://stackoverflow.com/a/466242

unsigned int v; // compute the next highest power of 2 of 32-bit v

v--;
v |= v >> 1;
v |= v >> 2;
v |= v >> 4;
v |= v >> 8;
v |= v >> 16;
v++;


________RESULTING API_____
    public static int nextPowOf2(int v) {
        v--;
        v |= v >> 1;
        v |= v >> 2;
        v |= v >> 4;
        v |= v >> 8;
        v |= v >> 16;
        v++;
        return v;

    }




Press Enter key to continue...


 ATTENTION 
Try to not alter the semantic of the code snippet.
If the stackoverflow code snippet declares the main method, you should perform the APIzation on the main and keep unaltered all the other method declarations (if any)


====== BEGINNING EXPERIMENT ======
Press Enter key to continue...



Please do the APIzation for the following stackoverflow code snippet
http://www.stackoverflow.com/a/10095840
open file /Users/jondoe/sw/apify.experiment/src/main/java/soapify/Post10095840.java
Go to src/main/java/soapify you should found the above Java class file
copy and paste the code snippet from stackoverflow into this Java file and manually perform the APIzation
make sure that the Java file compiles without errors

when you have done save the Java file, type "done" and press enter
if you are tired press exit you can resume later
```
