package q615;

public class Student {
	private String name;
	private int kor, math;
	
	Student(String name, int kor, int math) {
		this.name = name;
		this.kor = kor;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}
