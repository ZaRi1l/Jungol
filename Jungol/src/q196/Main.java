package q196;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person[] p = new Person[3];

		for (int i = 0; i < p.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[i] = new Person(st.nextToken(), st.nextToken(), st.nextToken());
		}
		br.close();

		Arrays.sort(p, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		StringBuffer sb = new StringBuffer();
		sb.append("name : ").append(p[0].getName()).append('\n');
		sb.append("tel : ").append(p[0].getPhoneNumber()).append('\n');
		sb.append("addr : ").append(p[0].getAddress());
		System.out.print(sb);

	}

}

class Person {
	String name, phoneNumber, address;

	public Person(String name, String phoneNumber, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

}
