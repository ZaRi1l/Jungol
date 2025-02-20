package q565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] n = new int[st.countTokens() - 1]; // 토큰 수를 가져와서 - 1만큼 배열 할당(마지막 숫자는 0이니까)

		for (int i = 0; i < n.length; i++) { // 값 넣기
			n[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(n); // 오름차순 정렬

//		for (int i = 0; i < n.length; i++) {
//			System.out.println(n[i]);
//		}

		int tenb = 0; // 전에 10의 자리 숫자
		int tena = 0; // 후에 10의 자리 숫자
		for (int i = 0; i < n.length; i++) {
			if (i == 0) {
				tena = n[i] / 10;
				n[i] = 1; // 10의 자리 숫자가 한번 있었다.
			} else {
				tena = n[i] / 10;
				if (tena == tenb) {
					n[i] = n[i - 1] + 1; // 전에 거와 같으면 1더해서 넣어주기
				} else {
					n[i] = 1;		// 아니라면 1넣어주기 그리고 전에 거 출력
					System.out.println(tenb + " : " + n[i - 1]);
				}
			}
			tenb = tena;
			if (i == n.length - 1) {
				System.out.println(tenb + " : " + n[i]);
			}
		}
	}
}
