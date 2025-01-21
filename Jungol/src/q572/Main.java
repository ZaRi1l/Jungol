package q572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		br.close();

		circle(r);
	}

	private static void circle(int r) {
		System.out.printf("%.2f", r * r * 3.14);
	}

}
