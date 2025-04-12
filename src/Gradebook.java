/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class manages an array of Student objects, allowing the user
 * to add, sort, and display students.
 */

public class Gradebook {

	// Array of Student objects
	private Student[] students;
	// Counter for students
	private int count;
	
	// Constructor with initial size
	public Gradebook(int size) {
		students = new Student[size];
		count = 0;
	}
	
	// Sort using selection sort
	public void sortStudents() {
		Sorting.selectionSort(students);
	}
	
	// Display all students in the array
	public void displayStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
	
	// Add a new student
	public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        }
    }
	
}
