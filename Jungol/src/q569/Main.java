package q569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] student = new int[5][4];

		for (int i = 0; i < student.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();

		int pass = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < student.length; i++) {
			int sum = 0;
			for (int j = 0; j < student[i].length; j++) {
				sum += student[i][j];
			}

			if (sum / student[i].length >= 80) {
				pass += 1;
				sb.append("pass").append('\n');
			} else {
				sb.append("fail").append('\n');
			}
		}
		sb.append("Successful : ").append(pass);

		System.out.print(sb);
	}
}
