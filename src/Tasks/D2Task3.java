package Tasks;

import java.util.Scanner;

public class D2Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] labels = new String[] {"st","nd","rd","th","th","th","th","th","th","th"};
		int[] nums = new int[10];
		int srch, count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Enter " + (i + 1) + labels[i] + " number: ");
			nums[i] = sc.nextInt();
		}
		
		System.out.print("\nEnter the number to count frequency of: ");
		srch = sc.nextInt();
		for(int num : nums) {
			if(num == srch) {
				count++;
			}
		}
		
		System.out.println("\nThe number " + srch + " appears " + count + " times.");

	}

}
