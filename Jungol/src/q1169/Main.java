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
		if (idx == dice.length) { // idx가 주사위 배열의 길이와 같다면 출력
			for (int i = 0; i < dice.length; i++) {
				sb.append(dice[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		switch (m) {
		case 1: // M = 1 : 주사위를 N번 던져서 나올 수 있는 모든 경우
			for (int i = 1; i <= 6; i++) {
				dice[idx] = i;
				dfs(idx + 1);
			}
			break;
		case 2: // M = 2 : 주사위를 N번 던져서 중복이 되는 경우를 제외하고 나올 수 있는 모든 경우
			if (idx == 0)
				for (int i = 1; i <= 6; i++) {
					dice[idx] = i;
					dfs(idx + 1);
				}
			else
				for (int i = dice[idx - 1]; i <= 6; i++) { // 바로 앞에서 나왔던 숫자부터 넣어주면 중복이 안생김
					dice[idx] = i;
					dfs(idx + 1);
				}
			break;
		case 3: // M = 3 : 주사위를 N번 던져서 모두 다른 수가 나올 수 있는 모든 경우
			for (int i = 1; i <= 6; i++) {
				boolean in = false;
				for (int j = 0; j < idx; j++) { // 앞에서 i가 나왔는지 검사
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
