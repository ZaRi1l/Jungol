package q1291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int s, e;

		while (true) {
			st = new StringTokenizer(br.readLine(), " ");

			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());

			if (e > 9 || e < 2 || s > 9 || s < 2) {
				System.out.println("INPUT ERROR!");
				continue;
			} else {
				break;
			}
		}
		br.close();

		StringBuffer sb = new StringBuffer();

		if (s < e) {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j <= e; j++) {
					sb.append(String.format("%d * %d = %2d", j, i, i * j));
					if (j != e)
						sb.append("   ");
				}
				sb.append('\n');
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = s; j >= e; j--) {
					sb.append(String.format("%d * %d = %2d", j, i, i * j));
					if (j != e)
						sb.append("   ");
				}
				sb.append('\n');
			}
		}

		System.out.print(sb);

	}

}
