package q1430_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine().trim());
		int b = Integer.parseInt(br.readLine().trim());
		int c = Integer.parseInt(br.readLine().trim());
		br.close();

		Integer res = a * b * c;
		int[] num = new int[10];

		int div = 1;
		while(true) {
			if (res / div == 0) {
				break;
			}
			
			int n = res % (div * 10) / div;
			num[n]++;
			div *= 10;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]).append('\n');
		}
		System.out.print(sb);

	}

}
