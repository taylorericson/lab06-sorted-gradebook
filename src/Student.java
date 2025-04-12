
public class Student implements Comparable<Object>
{

	private String firstName, lastName;
	private int score;
	
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
