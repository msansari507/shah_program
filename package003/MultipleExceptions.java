/* Assignment 66 WAP on exception handling using Try Catch
 when we get 2 exceptions in a single scenario*/
package package003;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the values of a (Numerator) & b (Denominator)");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b= s.nextInt();
			s.close();
			int division = a/b;
			System.out.println("Divison: "+division);
		}
		catch(InputMismatchException e) {
			System.out.println("String values can not be divide");
		}
		catch(ArithmeticException c) {
			System.out.println("Denominator should not be zero; b!=0 ");
		}
		

	}

}
