package q599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < str.length(); i ++) {
			char c = str.charAt(i);
			if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') ) {
				sb.append(c);
			}
		}
		
		System.out.print(sb.toString().toUpperCase());
	}

}
