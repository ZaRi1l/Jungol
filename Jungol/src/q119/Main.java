package q119;

public class Main {

	public static void main(String[] args) {
		java.util.Calendar cal = java.util.Calendar.getInstance();

		int a = 0;
		a = cal.get(java.util.Calendar.YEAR) - 1900; // ---① 
		int b = cal.get(java.util.Calendar.MONTH); // ---② 
		int c = cal.get(java.util.Calendar.DATE);
		System.out.printf("%d %d %d ", a, b, c); // ---③ //① ② ③에서의 a값을 1, 2, 3자리에 각각 써 넣는다. 
	}

}
