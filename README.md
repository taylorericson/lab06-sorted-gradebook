# lab06-sorted-gradebook
## CSC 240 - Lab 6 Sorted Gradebook

A project completed as part of the class CSC 240 at Parkland College.

Directions: 
-
Demonstrate polymorphism with interfaces by developing an application that prompts a user to create five students by entering a first name, last name, and a single test score between 0 and 100. After the students have been entered, sort the students by test score using the selection sort method in descending order (highest to lowest) and print the list of students to the Console. Referencing the examples in the Content area as well as the example in section 10.4 of the textbook:

-        Develop a Student class that implements the Comparable interface.

-        Use (and modify) the Sorting class from section 10.4 to sort the students. Note only a very slight modification is necessary to the Sorting class.

-        In addition to the Student class, the Sorting class, and a driver class, develop a Gradebook class to manage the list of students

-        Use the Gradebook class to store an array of Student objects (NOTE: to work correctly with the Sorting algorithm, do not use an ArrayList)

When writing the Gradebook class, be sure to use good design principles. Specifically, think about the information a class should store or “know” (which become the class variables) and the actions a class should be able to perform or “do” (which become the class methods). Be sure to reference the instructor programming examples.

**Example program output**

Enter student <firstName> <lastName> <score>: Jane Doe 62

Enter student <firstName> <lastName> <score>: Billy Smith 98

Enter student <firstName> <lastName> <score>: Sally Spencer 100

Enter student <firstName> <lastName> <score>: Bob Jones 47

Enter student <firstName> <lastName> <score>: Anne Williams 53

Sally Spencer 100

Billy Smith 98

Jane Doe 62

Anne Williams 53

Bob Jones 47
