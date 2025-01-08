package q105;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		System.out.printf("%15s%,15d%15s\n", "Seoul", 10312545, "+" + NumberFormat.getInstance().format(91375));
		System.out.printf("%15s%,15d%15s\n", "Pusan", 3567910, "+" + NumberFormat.getInstance().format(5868));
		System.out.printf("%15s%,15d%15s\n", "Incheon", 2758296, "+" + NumberFormat.getInstance().format(64888));
		System.out.printf("%15s%,15d%15s\n", "Daegu", 2511676, "+" + NumberFormat.getInstance().format(17230));
		System.out.printf("%15s%,15d%15s\n", "Gwangju", 1454636, "+" + NumberFormat.getInstance().format(29774));
		
	}
}
