/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: Represents a student with a first name, last name, and a test score.
 * This class implements Comparable to allow sorting based on score.
 */

public class Student implements Comparable<Object>
{

	private String firstName, lastName;
	private int score;
	
	// Constructs a Student object with first name, last name, and score
	public Student(String first, String last, int grade) 
	{
		firstName = first;
		lastName = last;
		score = grade;
	}
	
	// Getters
	public String getFirstName () { return firstName; }
	public String getLastName () { return lastName; }
	public int getScore () { return score; }
	
	// Compares students for sorting by score (last name if scores are equal)
	public int compareTo (Object other) 
	{
		Student otherStudent = (Student) other;
		
		// Compare scores in descending order
		if (score != otherStudent.getScore()) {
			return Integer.compare(otherStudent.getScore(), score);
		}
		// Compare by last names if scores are equal
		else {
			return lastName.compareTo(otherStudent.lastName);
		}
	}
	
	// Returns a formatted String with the student's first name, last name, and score
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + score;
	}
	
}
