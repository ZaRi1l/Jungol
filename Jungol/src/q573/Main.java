package q573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		square(n);
	}

	static void square(int n) {
		StringBuffer sb = new StringBuffer();
		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				sb.append(++num).append(' ');
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
