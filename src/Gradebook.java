
public class Gradebook {

	private Student[] students;
	private int count;
	
	public Gradebook(int size) {
		students = new Student[size];
		count = 0;
	}
	
	public void sortStudents() {
		Sorting.selectionSort(students);
	}
	
	public void displayStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
	
	public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        }
    }
	
}
