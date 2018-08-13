# COMP1231-Assignments
This repository is designed to present my assignment coursework for TRU-OL COMP1231, a Java-based course on Object-Oriented programming.
These assignemts were graded and came out to a 93% in total.

I attempt to place a focus on **testing** of each component of the program, including some tests which are not including in the original submissions. These tests serve to test the run-time performance of the programs, and to test the robustness of each class and method by providing a wide range of inputs. 

## Assignment 1
This introductory assignment is used to demonstrate the use of class hierarchy within a Java program. A *Shape* super class is instantiated, which contains common shape properties such as surface area and volume, and methods to calculate these properties.

Classes Cone, Cube, and Cylinder, all inherit from the Shape class and present the use of common features of the superclass. The goal is to maintain a strict **is-a** relationship between each class, a very important aspect of OOP

## Assignment 2
This assignment focuses on implementing a simple interface that defines a setter/getter method pair for priority-based classes. In this assignment, the *Task* class represents some task on a to-do list, and possesses a priority attribute. The *Priority* interface allows the programmer to implement the setter/getter method to create tasks with different priorities and keep track of the various tasks.

Furthermore, the *java.lang.Comparable* interface is also implemented in *Task* class to demonstrate the usefulness of such interfaces. Its compareTo() method is defined in Task, and allows user to compare the difference in priority between various tasks.  

## Assignment 3
This assignment focuses on the use of arrays to complete 2 different tasks, both of which use input streeams to 
process an appropriate output

### Part 1
*Average.java* uses a Scanner object to prompt the user for 10 integers. If decimal places or letters are entered, 
the program handles the parse exception by notifying the user of the invaid input, and asking them again for a
valid input. the final result is the average value, which is displaces as a double value

### Part 2
*Library.java* uses a BufferedReader to read each line of a file containing book titles, some of which are duplicates
of each other. The program cycles through each title and removes any duplicates, before writing the unique titles
into an output file. 

## Assignment 4
This assignment focues on the use of stacks, an abstract data type (ADT) to complete 2 different tasks with an output

### Part 1
This program implements a user-defined ADT stack in *Parade.java*, to add clowns (defined in *Clown.java*) to a parade,
with clowns only being able to join a parade at the back of the parade, and leave at the front of the parade. This implementation
is similar to a Drop-out stack. The program outputs the order of the clowns in the parade as well as their names.

### Part 2
This program implements a generic ADT in *BoxDrawer.java* for the purpose of drawing the generic types stored in the ADT 
in a random fashion. This is used to draw a collection of Strings at random (people's names), and 5 integer numbers at random. This 
is used to assign people to a number, such as a table.

## Assignment 5
This assignment focuses on the use of GUI components, events, and listeners to build 2 programs that the user can interact with.

### Part 1
This program is a GUI application that allows the user to input text into a *JTextArea*, and calculates the total word length and
average word length. Through tests, most unicode characters are recognized as separate words. If no words are provided, the program
displays a *JOptionPane* message dialog telling the user to provide a valid input 

### Part 2
This program is a GUI application that uses a *Timer* class to act as a stopwatch. The application provides the user with a start, stop, and reset button, and uneditable field to output the time in seconds to 1 decimal place. The application has been tested such that all combinations of start, stop, and reset button clicks work as intended. Mnemonics are also attached to the buttons to allow the user to 
activate the stopwatch easily.
