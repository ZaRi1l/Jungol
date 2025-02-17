package q1856;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				for (int j = 1 + i * m; j <= m + i * m; j++)
					sb.append(j).append(' ');
			else
				for (int j = m + i * m; j > i * m; j--)
					sb.append(j).append(' ');

			sb.append('\n');
		}

		System.out.print(sb);
	}

}
