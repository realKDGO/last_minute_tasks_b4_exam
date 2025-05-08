package Tasks;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade;
		
		System.out.print("Enter Your Grade: ");
		if(!sc.hasNextInt()) {
			System.out.println("Enter a valid grade.");
		} else {
			grade = sc.nextInt();
			
			if(grade < 0 || grade > 100) {
				System.out.println("Grade must be between 1 and 100.");
			} else if (grade >= 90) {
				System.out.println("Grade: A");
				System.out.println("Impressive");
			} else if(grade >= 80) {
				System.out.println("Grade: B");
				System.out.println("Great Job!");
			} else if(grade >= 70) {
				System.out.println("Grade: C");
				System.out.println("Keep Up The Good Work!");
			} else if(grade >= 60) {
				System.out.println("Grade: D");
				System.out.println("Not Bad");
			} else {
				System.out.println("Grade: F");
				System.out.println("More Improvements!");
			}
		}

	}

}
