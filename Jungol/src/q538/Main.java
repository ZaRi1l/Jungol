package q538;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		do {
			System.out.print("number? ");
			n = Integer.parseInt(br.readLine());

			if (n > 0) {
				System.out.println("positive integer");
			} else if (n < 0) {
				System.out.println("negative number");
			}

		} while (n != 0);
		br.close();
	}

}
