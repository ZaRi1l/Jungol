package q193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = new String[5];
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}

		String con1 = br.readLine();
		String con2 = br.readLine();
		br.close();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains(con1) || str[i].contains(con2))
				sb.append(str[i]).append('\n');
		}

		System.out.print(sb.length() == 0 ? "none" : sb);

	}

}
