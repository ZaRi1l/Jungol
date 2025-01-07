package q596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		String str = st.nextToken();
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i < n + 1; i++) {
			sb.append(str.charAt(str.length() - i));
			if (str.length() - i ==  0) break;
		}
		System.out.print(sb);
	
		
	}

}
