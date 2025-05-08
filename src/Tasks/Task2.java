package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int randNum = rand.nextInt(20);
		int guess = 0, atmpts = 0;
		
		while(true) {
			System.out.print("Guess the number from 1 to 20: ");
			if(!sc.hasNextInt()) {
				System.out.println("Enter a valid number: ");
				sc.next();
				continue;
			}
			
			guess = sc.nextInt();
			atmpts++;
			
			 if(guess < randNum) {
				 System.out.println("Too Low!");
			 } else if(guess > randNum) {
				 System.out.println("Too High!");
			 } else {
				 System.out.println("Congratulation! You guessed it in " + atmpts + " attempts.");
				 break;
			 }
		}
	}

}
