package q564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		HashMap<String, Integer> cap = new HashMap<String, Integer>();

		String a = st.nextToken();

		while ('A' <= a.toCharArray()[0] && 'Z' >= a.toCharArray()[0]) {
			if (cap.containsKey(a))
				cap.put(a, cap.get(a) + 1);
			else
				cap.put(a, 1);

			a = st.nextToken();
		}

		ArrayList<String> key = new ArrayList<String>(cap.keySet());
		Collections.sort(key);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < key.size(); i++) {
			sb.append(key.get(i)).append(" : ").append(cap.get(key.get(i))).append('\n');
		}

		System.out.print(sb);
	}

}
