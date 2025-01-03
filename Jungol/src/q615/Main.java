package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] st = new Student[2];
		int avgKor, avgMath;
		
		Scanner sc = new Scanner(System.in);
		
		st[0] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		st[1] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		sc.close();
		
		avgKor = (st[0].getKor() + st[1].getKor()) / 2;
		avgMath = (st[0].getMath() + st[1].getMath()) / 2;
		
		System.out.printf("%s %d %d\n", st[0].getName(), st[0].getKor(), st[0].getMath());
		System.out.printf("%s %d %d\n", st[1].getName(), st[1].getKor(), st[1].getMath());
		
		System.out.printf("avg %d %d", avgKor, avgMath);
	}

}
