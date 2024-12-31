package q614;

public class Student {
	private String school;
	private int grade;
	
	Student() {
		this("Jejuelementary", 6);
	}
	
	Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void inform() {
		System.out.println(this.grade + " grade in " + this.school + " School");
	}

}
