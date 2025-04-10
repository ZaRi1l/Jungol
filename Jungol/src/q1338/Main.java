package q1338;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		int[][] ch = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1)
					ch[i][j] = 'A' + i;
				else if (i + j >= n)
					ch[i][j] = ch[i][j - 1] + 2 * n - (i + j) - 1;
				else {
					ch[i][j] = ' ';
					continue;
				}

				ch[i][j] = (ch[i][j] - 'A') % 26 + 'A';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char) ch[i][j] + " ");
			}
			System.out.println();
		}
	}

}
