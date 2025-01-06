package q518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int[] num = new int[3];
		
		for (int i = 0 ; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = num[1] + num[2] + num[0];
		int avg = sum / 3;
		
		StringBuffer sb = new StringBuffer();
		sb.append("sum : ");
		sb.append(sum);
		sb.append("\n");
		sb.append("avg : ");
		sb.append(avg);
		
		System.out.print(sb);
	}

}
