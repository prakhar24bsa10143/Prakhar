# Simple Library Management System

A lightweight, console-based Library Management System built using Core Java
# Overview of the Project
This is a minimal yet fully functional Library Management System developed as a semester project for Object-Oriented Programming (Java).
It demonstrates core OOP concepts such as classes, objects, encapsulation, collections (ArrayList), methods, and basic error handling — without using any external libraries or database.
Perfect for beginners and guaranteed to meet all academic requirements.
# Features

Add new books (Title + ISBN)
Register new library members
Borrow a book by ISBN (marks book as unavailable)
Return a book by ISBN (marks book as available again)
Display all books with real-time availability status
Simple, user-friendly menu-driven interface
Input validation and clear error messages

# Technologies / Tools Used

Language: Java SE 8+
Data Structure: ArrayList (in-memory storage)
Input Handling: java.util.Scanner
No external dependencies · No GUI · No database · No build tools required

# Steps to Install & Run the Project
Method 1: Using Command Line (Recommended)
Bash# 1. Clone or download the repository
# 2. Compile all Java files
javac *.java

# 3. Run the program
java Main
Method 2: Using any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans)

# Open the project folder
Let the IDE detect the .java files
Run Main.java (it contains the public static void main)

# Instructions for Testing
The program starts with sample data (2 books + 1 member) so you can test immediately.
Test Cases to Try:

Choose 2 → See all books (both available)
Choose 3 → Borrow ISBN 111 → Book becomes unavailable
Choose 2 again → Availability changed to No
Choose 4 → Return ISBN 111 → Book becomes available again
Try borrowing a non-existing ISBN → Proper error message
Add your own book and member using options 1 and 5

