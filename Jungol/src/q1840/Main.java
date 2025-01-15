package q1840;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] pos, emp, wall; // 치즈 위치, 공기와 접촉하는 공간, 치즈와 공기와 닿는 벽의 개수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int xlen = Integer.parseInt(st.nextToken()); // 치즈 가로 세로 받아오기
		int ylen = Integer.parseInt(st.nextToken());

		pos = new int[xlen][ylen]; // 공간할당

		for (int i = 0; i < pos.length; i++) { // 치즈 넣어주기
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < pos[i].length; j++) {
				pos[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();

//		for (int i = 0; i < pos.length; i++) {	// 출력해보기
//			for (int j = 0; j < pos[i].length; j++) {
//				System.out.print(pos[i][j] + " ");
//			}
//			System.out.println();
//		}

		emp = new int[xlen][ylen]; // 공간할당
		wall = new int[xlen][ylen];

		int time = 0; // 몇 시간 걸렸는지
		int remain = 0; // 얼마나 남았는지
		while (true) {
			time += 1; // 시간 더하기
			dfs(0, 0); // dfs 호출

			boolean isEmp = true; // 빈상태인지 구별
			remain = 0; // 남은 거 0으로 놔두기
			for (int i = 0; i < pos.length; i++) {
				for (int j = 0; j < pos[i].length; j++) {
					if (pos[i][j] == 1) { // 만약에 현재 위치에 치즈가 있으면 남은 거 + 1
						remain += 1;
					}

					if (wall[i][j] >= 1) { // 닿는 벽이 1보다 크면 그 위치에 치즈 녹아서 없어짐
						pos[i][j] = 0;
					}
					wall[i][j] = 0; // 초기화
					emp[i][j] = 0;

					if (pos[i][j] == 1) { // 만약 위치에 아직 치즈가 남아 있으면 빈상태 false
						isEmp = false;
					}
				}
			}

			if (isEmp) // 남아있는 치즈 없으면 나가기
				break;
		}

		System.out.println(time); // 걸린시간
		System.out.println(remain); // 치즈가 0이 되기 전에 남은 치즈
	}

	public static void dfs(int x, int y) {
		if (emp[x][y] == 1) // 공기가 닿았던 곳인지 확인
			return;
		else
			emp[x][y] = 1; // 아니라면 공기 닿는 곳이라고 1로 표기해두기

		if (x != pos.length - 1) // 가장 자리 인 경우 제외
			if (pos[x + 1][y] == 1) // 가장 자리가 아니고,
				wall[x + 1][y] += 1; // 한칸 위에 위치에 치즈가 있다면 wall에 1 더하기
			else
				dfs(x + 1, y); // 만약에 치즈가 없다면 그 위치의 dfs 호출하기
		if (x != 0)
			if (pos[x - 1][y] == 1)
				wall[x - 1][y] += 1;
			else
				dfs(x - 1, y);

		if (y != pos[0].length - 1)
			if (pos[x][y + 1] == 1)
				wall[x][y + 1] += 1;
			else
				dfs(x, y + 1);
		if (y != 0)
			if (pos[x][y - 1] == 1)
				wall[x][y - 1] += 1;
			else
				dfs(x, y - 1);

	}

}
