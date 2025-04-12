import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gradebook gradebook = new Gradebook(5);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter student <firstName> <lastName> <score>: ");
			String firstName = scanner.next();
			String lastName = scanner.next();
			int score = scanner.nextInt();
			gradebook.addStudent(new Student(firstName, lastName, score));
		}
		
		gradebook.sortStudents();
		System.out.println("\n----------------\n" +
							"Sorted Gradebook\n" +
							"----------------");
		gradebook.displayStudents();

	}

}
