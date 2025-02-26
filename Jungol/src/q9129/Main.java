package q9129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%.2f", Double.parseDouble(st.nextToken())));
		sb.append(String.format("%.2f", Double.parseDouble(st.nextToken())));
		sb.append(String.format("%.2f", Double.parseDouble(st.nextToken())));
		
		st = new StringTokenizer(sb.toString(), ".");
		sb = new StringBuffer();
		sb.append(st.nextToken()).append('\n');
		sb.append(st.nextToken()).append('\n');
		sb.append(st.nextToken()).append('\n');
		sb.append(st.nextToken());
		System.out.print(sb);
	}
}
