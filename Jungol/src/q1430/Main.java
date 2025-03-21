package q1430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine().trim());
		int b = Integer.parseInt(br.readLine().trim());
		int c = Integer.parseInt(br.readLine().trim());
		br.close();

		String res = Integer.toString(a * b * c);
		int[] num = new int[10];

		for (int i = 0; i < res.length(); i++) {
			num[res.charAt(i) - '0']++;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]).append('\n');
		}
		System.out.print(sb);

	}

}
