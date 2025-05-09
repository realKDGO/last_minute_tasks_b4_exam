package Tasks;

import java.util.Scanner;

public class D2Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		System.out.println("Enter 10 numbers.");
		for(int i = 0; i < num.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nReversed Array");
		for(int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}

	}

}
