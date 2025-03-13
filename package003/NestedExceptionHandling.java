// Assignment 62 WAP on nested Exception Handling using try & catch keywords
package package003;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NestedExceptionHandling {
  public static void main(String[] args) {
		try { // outer try
		boolean b ;
		System.out.println("If you are Indian citizen write 'true' otherwise 'false'");
		Scanner s1 = new Scanner(System.in);
		b = s1.nextBoolean();
		if(b) {
			System.out.println("Welcome to Voting System");
	
				System.out.println("Enter your age");
				int age;
				age = s1.nextInt();
				if(age>=18)
					System.out.println("Eligible for voting");
				else
					System.out.println("Not eligible for voting");
		}
		else
			System.out.println("Not eligible for voting");
		s1.close();
		}
		catch(InputMismatchException i) {// outer catch
			System.out.println("Enter either true or false");
			boolean b;
			Scanner s2 = new Scanner(System.in);
			b = s2.nextBoolean();
			if(b) {
				System.out.println("Welcome to Voting System");
			
			try {// inner try
				System.out.println("Enter your age"); 
				int age;
				age = s2.nextInt();
				s2.close();
				if(age>=18)
					System.out.println("Eligible for voting");
				else
					System.out.println("Not eligible for voting");
			}
			catch(InputMismatchException j){ //inner catch
				System.out.println("Age should be a positive & non zero number");
				}
		}
			else
				System.out.println("Not elgible for voting");

	}

}
	
}
