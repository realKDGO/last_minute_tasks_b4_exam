package Tasks;

import java.util.Scanner;

public class D2Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ranks = new String[] {"st","nd","rd","th","th"};
		int[] scores = new int[5];
		int sum = 0;
		double avg;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("Enter your " + (i + 1) + ranks[i] + " score: ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		avg = (double) sum / scores.length;
		
		System.out.println("\nSum of your scores: " + sum);
		System.out.println("Your average: " + avg);

	}

}
