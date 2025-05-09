package Tasks;

import java.util.Arrays; //For sort function
import java.util.Scanner;

public class D2Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print((i + 1) + ". Enter name: ");
			names[i] = sc.nextLine();
		}
		
		System.out.println("\nNames before sorting: ");
		for(String name : names) {
			System.out.println(name);
		}
		
		//Applying sort
		Arrays.sort(names);
		
		System.out.println("\nNames after sorting: ");
		for(String name : names) {
			System.out.println(name);
		}

	}

}
