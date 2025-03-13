// Assignment 64 WAP on finally keyword concept
package package003;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyKeywordConcept {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to City Traffic System");
			System.out.println("Enter your age");
			Scanner s = new Scanner(System.in);
			int age = s.nextInt();
			s.close();
			if(age>=18)
				System.out.println("Eligible for driving");
			else
				System.out.println("You are not Eligible for driving");
		}
		catch(InputMismatchException i) {
			System.out.println("Age should be a positive number");
		}
		finally {// this block will always execute
			System.out.println("Always follow Traffic Rules.");
			System.out.println("Thank you for choosing us..!!");
			
		}

	}

}
