package q1304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int[][] arr = new int[n][n];
		
		int num = 0;
		for(int i = 0; i< n; i++) {
			for(int j =0; j< n; j++) {
				arr[j][i] = ++num;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i< n; i++) {
			for(int j =0; j< n; j++) {
				sb.append(arr[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.print(sb);
	}

}
