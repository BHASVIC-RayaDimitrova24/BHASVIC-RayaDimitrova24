# C-Chapter7-Strings
This chapter covers strings.

A string is a sequence of characters - unlike more modern languages, C doesn't hide this from the programmer and forces you to work with the arrays themselves. One consequence of this is that you need to declare the maximum length of the string and account for the end of string character.

All words are strings but not all strings are words. 

A perfect example of this is a phone number - we are likely to store a phone number a string rather than a number for a couple of reason:
+ We aren't planning to perform mathematical operations on the phone number.
+ The zero at the start of the number could be lost if stored as an integer.
+ Decimal places could be added if stored as a float.

## C-Chapter Structure
While you are learning C you will be working through a series of structured activites following a structure called **PRIMM**. This process is designed to slowly introduce new concepts, allowing you to build confidence, rather than throwing you in at the deep end.

In this repository you will find five files:
+ Student Work - Chapter 7 - Strings.pptx **(Start Here)**
+ Supporting Documentation - Chapter 7 - Strings.pptx **(Read this fully)**
+ Starter Code - Chapter 7.c **(This is the code for the 4a slides)**
+ README.md (You are reading this!)
+ .gitignore (Ignore this)

## PRIMM Programming Explained

You will move through a series of stages that mean the code you are running goes: 

Not yours --> Partly yours --> All yours.

The stages are:

### Predict
In this stage you are given a piece of code and need you try to figure out what the code would do when it is run.

### Run
In this stage you download and run the code to see if your prediction was correct. The reasons we are giving you the code are:

+ It *should* mean that your code definitely runs.
+ There is less chance (in theory no chance) that an error will slip in.
+ It's quicker!!

### Investigate
In this stage you are figuring out how the code works:

+ What does each line do?
+ What variables are being used?
+ What data types are being processed?

### Modify
In this stage you start to make changes to exisiting code, changing outputs, changing process, etc.

You are still working with the code that you were given so the chances of errors are still fairly low but as you make changes you might accidentally remove a semi-colon so having the other lines of code already should help you figure the mistake out.

### Make
In this stage you are **finally** writing your own code! 

By starting a completely fresh program you now have full ownership of the code but you'll have already seen the concept, investigated the concept and even modified code containing the concept before reaching this stage.

# FAQs

## Do we have to learn C?
Yes

## Why?
Because C teaches you important concepts that other languages simplfy - making you a better programmer.

## Do we have to follow PRIMM?
Yes

## Why?
Because research has shown that it following the steps has a positive outcome on learning the programming concepts that you need to understand.

+ Bradley, S., & Ramezani, A. (2024, January). PRIMM and Proper: Authentic Investigation in HE Introductory Programming with PeerWise and GitHub. In Proceedings of the 8th Conference on Computing Education Practice (pp. 33-36).
+ Law, R. (2020, September). A pedagogical approach to teaching game programming: Using the PRIMM approach. In 14th European Conference on Game-Based Learning (pp. 816-819). Academic Conferences International.
+ Udenze, A., & Elfallah, M. (2020). PRIDAM: a framework for teaching programming. Research in Teacher Education, 10(1), 6-10.

## Why do we need to Predict what the code does?
Because being able to look at a piece of code and understand what it does is an important skill. You should also be able to figure out what the output, given a specific input will be.
