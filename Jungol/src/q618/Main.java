package q618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person[] informs = new Person[5];

		for (int i = 0; i < informs.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			informs[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()),
					Double.parseDouble(st.nextToken()));
		}
		br.close();

		StringBuffer sb = new StringBuffer();

		// 이름 정렬
		Arrays.sort(informs, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		// 이름순 출력
		sb.append("name").append('\n');
		for (int i = 0; i < informs.length; i++) {
			sb.append(informs[i].getName()).append(' ');
			sb.append(informs[i].getHeight()).append(' ');
			sb.append(informs[i].getWeight()).append('\n');
		}
		
		sb.append('\n');

		// 몸무게 정렬
		Arrays.sort(informs, (o1, o2) -> o2.getWeight() - o1.getWeight() < 0 ? -1 : 1);
		
		// 몸무게 출력
		sb.append("weight").append('\n');
		for (int i = 0; i < informs.length; i++) {
			sb.append(informs[i].getName()).append(' ');
			sb.append(informs[i].getHeight()).append(' ');
			sb.append(informs[i].getWeight()).append('\n');
		}

		System.out.print(sb);
	}

}

class Person {
	String name;
	int height;
	double weight;

	Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}