package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		
		st.name = sc.next();
		st.school = sc.next();
		st.grade = sc.nextInt();
		
		System.out.println("Name : " + st.name);
		System.out.println("School : " + st.school);
		System.out.println("Grade : " + st.grade);
	}

}

class Student {
	String name, school;
	int grade;
}
