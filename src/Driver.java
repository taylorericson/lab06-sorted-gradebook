/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: Driver class that allows the user to input information for 
 * five students to be added to the Gradebook, sorted, and displayed.
 */

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Create a Gradebook to store five students
		Gradebook gradebook = new Gradebook(5);
		
		// Prompt the user to enter information for five students
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter student <firstName> <lastName> <score>: ");
			String firstName = scanner.next();
			String lastName = scanner.next();
			int score = scanner.nextInt();
			
			// Create a new Student object and add it to the gradebook
			gradebook.addStudent(new Student(firstName, lastName, score));
		}
		
		// Sort the students in descending order by scores
		gradebook.sortStudents();
		System.out.println("\n----------------\n" +
							"Sorted Gradebook\n" +
							"----------------");
		// Display the sorted list of students
		gradebook.displayStudents();
	}

}
