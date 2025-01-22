package q560;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int min = Integer.MAX_VALUE;
		while (st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			if (a < min) {
				min = a;
			}
		}
		System.out.print(min);
	}

}
