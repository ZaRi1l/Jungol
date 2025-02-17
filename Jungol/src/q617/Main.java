package q617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person[] people = new Person[5];

		StringTokenizer st;
		for (int i = 0; i < people.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			people[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		br.close();

		Arrays.sort(people, (o1, o2) -> o1.height - o2.height);

		StringBuffer sb = new StringBuffer(people[0].getName()).append(' ').append(people[0].getHeight());
		System.out.print(sb);
	}

}

class Person {
	String name;
	int height;

	Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
