package q601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= str.length(); i++) {
			for (int j = str.length() - i; j < 2 * str.length() - i; j++) {
				sb.append(str.charAt(j % str.length()));
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}

}
