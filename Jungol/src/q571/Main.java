package q571;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		print3(a);
		
		sc.close();
		
	}
	
	public static void print3(int a) {
		for (int i=0; i < a; i++) {
			System.out.println("~!@#$^&*()_+|");
		}
	}

}
