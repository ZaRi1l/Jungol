package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		sc.close();
		
		System.out.println(var);
		if (var < 0) 
			System.out.println("minus");
	}

}
