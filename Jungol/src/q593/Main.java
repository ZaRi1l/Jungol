package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("ASCII code =? ");
			n = sc.nextInt();
			if (n < 33 || n > 127) break;
			
			System.out.printf("%c\n" , n);
			// System.out.print((char)n + "\n");
		}
		
		sc.close();
	}

}
