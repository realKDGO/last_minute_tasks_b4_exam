package Tasks;

import java.util.Scanner;

public class D2Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min, max;
		int[] nums = new int[10];
		
		System.out.println("Enter 10 numbers.");
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = sc.nextInt();
		}
		
		min = nums[0];
		max = nums[0];
		
		for(int num : nums) {
			if(num < min) min = num;
			if(num > max) max = num;
		}
		
		System.out.println("\nMinimum number: " + min);
		System.out.println("Maximum number: " + max);

	}

}
