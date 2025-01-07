package q519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		StringBuffer sb = new StringBuffer();
		sb.append(Integer.parseInt(st.nextToken()) + 100);
		sb.append(" ");
		sb.append(Integer.parseInt(st.nextToken()) % 10);
		
		System.out.println(sb);
	}

}
