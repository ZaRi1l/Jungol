package q561;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);
		int max = 0;
		int min = 10000;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 100 && max < nums[i])
				max = nums[i];
			else if (nums[i] >= 100 && min > nums[i])
				min = nums[i];
		}
		max = max == 0 ? 100 : max;
		min = min == 10000 ? 100 : min;

		System.out.print(new StringBuffer().append(max).append(' ').append(min));
	}

}
