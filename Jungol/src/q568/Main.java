package q568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] fa = new int[2][4];
		int[][] sa = new int[2][4];

		System.out.println("first array");
		for (int i = 0; i < fa.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < fa[i].length; j++) {
				fa[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println("second array");
		for (int i = 0; i < sa.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < sa[i].length; j++) {
				sa[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < fa.length; i++) {
			for (int j = 0; j < fa[i].length; j++) {
				sb.append(fa[i][j] * sa[i][j]).append(' ');
			}
			sb.append('\n');
		}

		System.out.print(sb);

	}

}
