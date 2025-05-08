package Tasks;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//To show 2 decimal places instead of 00000000.
		DecimalFormat kd = new DecimalFormat("#.00");
		char opt = ' ';
		double a, b, res;
		
		System.out.print("Enter first number: ");
		a = sc.nextDouble();
		
		System.out.print("Enter second number: ");
		b = sc.nextDouble();
		
		System.out.print("Choose operator (+, -, *, /): ");
		opt = sc.next().charAt(0);
		
		switch(opt) {
		case '+':
			res = a + b;
			System.out.print(kd.format(a) + " + " + kd.format(b) + " = " + kd.format(res));
			break;
		case '-':
			res = a - b;
			System.out.print(kd.format(a) + " - " + kd.format(b) + " = " + kd.format(res));
			break;
		case '*':
			res = a * b;
			System.out.print(kd.format(a) + " * " + kd.format(b) + " = " + kd.format(res));
			break;
		case '/':
			//If denominator is 0 it will be infinite
			if(b == 0) {
				System.out.println("Error: Division by zero!");
				break;
			}
			res = a / b;
			System.out.print(kd.format(a) + " / " + kd.format(b) + " = " + kd.format(res));
			break;
		default:
			System.out.println("Error: Invalid Operator!");
		}

	}

}
