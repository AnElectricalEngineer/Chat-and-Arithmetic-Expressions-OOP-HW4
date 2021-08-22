# Chat and Arithmetic Expressions
 
This repository contains two unrelated programs which are both written in Java: a simple graphical chat application and a program that evaluates arithmetic expressions. 

## About Chat

Chat is a simple graphical chat application which uses the Swing package to implement the GUI. In this implementation, only 3 users are supported, but support for more can be added. Chat demonstrates proper use of the Strategy design pattern (for implementing client-side, independent font changes) and the Observer design pattern (for implementing the back-end that allows all chat users to see messages sent over the chat application). 

## Using Chat

To run the chat application, build the application, and then run ChatSystemGui. Each user can enter text in the lower text box, and send his/her message by pressing Enter. The message will be sent to and displayed in the received message text boxes of all users. Each user can independently change the font of displayed messages at run-time. The user can choose from a regular, bold, or alternate font. 

## Screenshot

![image](https://user-images.githubusercontent.com/47844685/130357532-38b85d0c-c6d3-4eb7-a21f-6c2587667dcf.png)

## About Arithmetic Expressions

Arithmetic expressions are expressions that can be evaluated, such as addition, subtraction, multiplication, divison, and unary minus. Complex expressions can be constructed from the aforementioned basic expressions, in a demonstration of the Composite design pattern.

## Using Arithmetic Expressions

Arithmetic Expressions can be evaluated to get a numeric value by using the `eval()` method. A string representation of them can be created by using the `toString()` method. An example file which demonstrates the capabilities of Arithmetic Expressions is provided: ExpressionTest.
