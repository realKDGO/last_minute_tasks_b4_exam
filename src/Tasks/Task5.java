package Tasks;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0, count = 5;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double avg;
		
		for(int i = 1; i <= count; i++) {
			System.out.print("Enter number " + i + ": ");
			num = sc.nextInt();
			
			sum += num;
			
			if(num < min) min =  num;
			if(num > max) max = num;
		}
		
		avg = (double) sum / count;
		
		System.out.println("\nSum     : " + sum);
		System.out.println("Average : " + avg);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);

	}

}
