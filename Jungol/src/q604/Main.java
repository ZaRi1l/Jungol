package q604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[10];
		
		for (int i = 0 ; i < str.length; i++) {
			str[i] = br.readLine();
		}
		
		char l = br.readLine().charAt(0);
		br.close();
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < str.length; i++) {
			if(str[i].charAt(str[i].length() - 1) == l)
				sb.append(str[i]).append('\n');
		}
		System.out.print(sb);
	}
}
