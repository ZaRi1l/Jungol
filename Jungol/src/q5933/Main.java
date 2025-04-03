package q5933;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		int[] num = new int[n];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				sb.append(num[j]).append(' ');
				num[j] = num[j] + j + 1;
			}
			sb.append('\n');
		}

		System.out.print(sb);

	}
}
