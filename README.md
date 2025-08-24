📌 Project: Custom Range Implementation in Java

This project implements a Python-like range() function in Java using an Iterable class.
It supports:

✅ Custom start, stop, and step values

✅ Both positive and negative ranges

✅ Negative indexing (like Python)

✅ Iteration using Java’s enhanced for-each loop

✅ Dynamic updates with setters (setStart, setStop, setStep)

✅ Length calculation via size()

✅ Easy debugging with toString()

🔧 Classes

range → Implements the custom range logic, provides iteration support.

Runner → Demonstrates usage of the range class.

Main → Entry point of the program.

🖼 UML Diagram

The UML diagram shows relationships:

Main → creates Runner

Runner → uses range

range → implements Iterable
