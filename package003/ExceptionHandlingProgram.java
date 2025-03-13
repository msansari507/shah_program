//Assignment 61 WAP on Exception Handling
package package003;

import java.util.Scanner;

public class ExceptionHandlingProgram {

	public static void main(String[] args) {
	  try {
	  int a , n, d;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter Values of Numerator and Denominator");
	  n = s.nextInt();
	  d = s.nextInt();
      a = n/d;
	  System.out.println("Divison Result: "+a);
	  s.close();
	  
	  }
	  catch(ArithmeticException a) {
		  System.out.println("Denominator can't be zero.");
	  }
	}

}
