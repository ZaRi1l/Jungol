package q1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n * m; i++) {
			sb.append(i);
			if (i % m == 0) sb.append('\n');
			else sb.append(' ');
		}
		
		System.out.print(sb);
	}

}
