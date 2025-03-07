package q1169;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dice;
	static int m;
	static StringBuffer sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		dice = new int[n];

		sb = new StringBuffer();
		dfs(0);

		System.out.print(sb);
	}

	private static void dfs(int idx) {
		if (idx == dice.length) {
			for (int i = 0; i < dice.length; i++) {
				sb.append(dice[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		switch (m) {
		case 1:
			for (int i = 1; i <= 6; i++) {
				dice[idx] = i;
				dfs(idx + 1);
			}
			break;
		case 2:
			if (idx == 0)
				for (int i = 1; i <= 6; i++) {
					dice[idx] = i;
					dfs(idx + 1);
				}
			else
				for (int i = dice[idx - 1]; i <= 6; i++) {
					dice[idx] = i;
					dfs(idx + 1);
				}
			break;
		case 3:
			for (int i = 1; i <= 6; i++) {
				boolean in = false;
				for (int j = 0; j < idx; j++) {
					if (i == dice[j]) {
						in = true;
						break;
					}
				}
				if (in)
					continue;
				
				dice[idx] = i;
				dfs(idx + 1);
			}
			break;
		}
	}
}
