# Library Management System Project

## Objective:

Design and implement a simplified library management system to track library resources, members, and borrowing activity within a Java application.

## Requirements:

### Entities:

- **Book**: Store title, author, ISBN, availability status.
- **Member**: Store name, member ID, contact information.
- **Borrowing Record**: Store book (ISBN), member (member ID), borrow date, due date.

### Core Functionalities:

- **Add/Remove Books**: Update the library's catalog.
- **Register/Remove Members**: Manage library membership.
- **Check Out Book**: Create a borrowing record, update the book's availability.
- **Return Book**: Update the borrowing record, mark the book available.
- **Calculate Overdue Fines**: Apply a daily overdue fine.
- **Data Persistence (Optional)**: Implement a basic mechanism to save and load library data (books, members, borrowing records). Consider simple file I/O.

### User Interface: Choose between:

Command-Line Interface (CLI): Use input/output functions and menus.
Basic Graphical User Interface (GUI): (More challenging) Use Java Swing or JavaFX.

## Constraints:

- Use Java's object-oriented programming concepts to model the entities and their relationships.
- Employ appropriate data structures (e.g., lists, maps) to manage the library data.

## Project Submission:

- Well-structured and commented Java source code.
- A brief report outlining your design choices, implementation details, and any known limitations.

## Evaluation Criteria:

- Functionality (meeting the core requirements)
- Code organization and object-oriented design
- Data structure usage efficiency
- Code readability and commenting
- Implementation of overdue fines
- Persistence mechanism (if implemented)

[Grading Chatbot Gemini](https://gemini.google.com/app/fa073f6bc309f545)
