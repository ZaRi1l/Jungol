package q555;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] str = new char[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.next().charAt(0);
		}
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		
		sc.close();
		
	}

}
