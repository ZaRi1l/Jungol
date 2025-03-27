package q1031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] bing = new int[5][5]; // 빙고판

		StringTokenizer st; // 값 넣기
		for (int i = 0; i < bing.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < bing[i].length; j++) {
				bing[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 출력해보기
//		for (int x = 0; x < bing.length; x++) {
//			for (int y = 0; y < bing[x].length; y++) {
//				System.out.print(bing[x][y] + " ");
//			}
//			System.out.println();
//		}

		int cnt = 1;		// 몇번 째 인지 변수
		for (int i = 0; i < 5; i++) { // 사회자가 부르는 수 대입해보기
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int num = Integer.parseInt(st.nextToken());	// 사회자가 부른 수
				for (int k = 0; k < bing.length; k++) { // 빙고판에다가 대입
					for (int l = 0; l < bing[k].length; l++) {
						if (bing[k][l] == num) {
							bing[k][l] = 0; // 해당 숫자가 있으면 0을 넣기
							break;
						}
					}
				}

				if (go(bing))	// 빙고 인지 확인
					break;
				cnt++;	// 몇번째 + 1

			}
		}
		br.close();

		System.out.print(cnt);
	}

	static boolean go(int[][] bing) {		// 빙고 인지 확인
		int row = 0;	// 가로줄
		int col = 0;	// 세로줄
		int diag = 0;	// 대각선

		// 가로줄 확인
		for (int i = 0; i < bing.length; i++) {
			boolean line = true;	// 확인용 변수 
			for (int j = 0; j < bing[i].length; j++) {
				if (bing[i][j] != 0) {
					line = false;	// 하나라도 0이 아니면 false
					break;
				}
			}
			if (line)	// line이 그대로 true 이면 row + 1
				row += 1;
		}

		// 세로줄 확인
		for (int i = 0; i < bing.length; i++) {
			boolean line = true;
			for (int j = 0; j < bing[i].length; j++) {
				if (bing[j][i] != 0) {
					line = false;
					break;
				}
			}
			if (line)
				col += 1;
		}

		// 대각선 확인 
		boolean line = true;
		boolean line2 = true;
		for (int i = 0; i < bing.length; i++) {
			if (bing[i][i] != 0)
				line = false;
			if (bing[i][bing.length - i - 1] != 0)
				line2 = false;
		}
		if (line)
			diag += 1;
		if (line2)
			diag += 1;

		// 다 합쳐서 3 이상이면 빙고
		if ((row + col + diag) >= 3)
			return true;
		else
			return false;
	}

}
