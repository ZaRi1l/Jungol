package q1314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		StringBuffer sb = new StringBuffer();
		int start = 0;
		int a = 0;
		for (int i = 1; i <= 2 * n; i += 2) {
			a = start;
			for (int j = 0; j < n; j++) {
				sb.append((char) (a + 65)).append(' ');

				if (j % 2 != 0) {
					a = (a + i) % 26;
				} else {
					a = (a + 2 * n - i) % 26;
				}
			}
			sb.append('\n');
			start = (start + 1) % 26;
		}

		System.out.println(sb);
	}

}
