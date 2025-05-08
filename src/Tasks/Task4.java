package Tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, res;
		
		System.out.print("Enter a number for multiplication table: ");
		if(sc.hasNextInt()) {
			num = sc.nextInt();
			System.out.println("Multiplication table for " + num + ": ");
			for(int i = 0; i <= 10; i++) {
				 res = num * i;
				 System.out.println(num + " x " + i + " = " + res);
			}
		} else {
			System.out.println("Invalid Input. Please input numeric value.");
		}
		
		
		 
	}

}
