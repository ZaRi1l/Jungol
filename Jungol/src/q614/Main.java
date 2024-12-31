package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student();
		Student st2 = new Student(sc.next(), sc.nextInt());
		sc.close();
		
		st1.inform();
		st2.inform();
		
	}

}
