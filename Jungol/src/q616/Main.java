package q616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Triangle t = new Triangle();
		for (int i = 0; i < t.getPoint().length; i++) {
			t.getPoint()[i].setX(Integer.parseInt(st.nextToken()));
			t.getPoint()[i].setY(Integer.parseInt(st.nextToken()));
		}
		br.close();

		System.out.printf("(%.1f, %.1f)", t.getCenterX(), t.getCenterY());
	}

}

class Triangle {
	private Point[] point;

	Triangle() {
		point = new Point[3];

		for (int i = 0; i < point.length; i++) {
			point[i] = new Point();
		}
	}

	public Point[] getPoint() {
		return point;
	}

	public void setPoint(Point[] point) {
		this.point = point;
	}

	public Double getCenterX() {
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += point[i].getX();
		}

		return sum / 3.0;
	}

	public Double getCenterY() {
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += point[i].getY();
		}

		return sum / 3.0;
	}

}

class Point {
	private int x, y;

	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
