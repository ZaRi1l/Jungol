package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[100];
		int num;
		
		for (int i = 0; i < nums.length; i++) {
			num = sc.nextInt();
			
			if (num == 0) break;
			nums[i] = num;
		}
		
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0) continue;
			System.out.print(nums[i] + " ");
		}
		
		sc.close();
	}

}
