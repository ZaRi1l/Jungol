package q111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		int sum = 0;
		int avg = 0;

		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		avg = sum / 4;

		StringBuffer sb = new StringBuffer("sum ");
		sb.append(sum).append('\n');
		sb.append("avg ").append(avg);

		System.out.print(sb);

	}

}
