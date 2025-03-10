package q1307;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		StringBuffer sb = new StringBuffer();
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int a = (j * n + i) % 26 + 'A';
				sb.append((char) a).append(' ');
			}
			sb.append('\n');
		}

		System.out.print(sb);
	}

}
