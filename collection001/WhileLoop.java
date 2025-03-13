// Assignment 90 WAP Program on While Loop
package collection001;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=2;i++) { // added for loop just to check two numbers at run time
		//program to reverse the number
		System.out.println("Enter any poitive number");
		
		int num = s.nextInt();
		int original_number = num;
		int sum = 0;
		int rem = 0;
		while(num!=0) {
			rem = num %10;
			num = num/10;
			sum = sum*10 + rem;
		}
		System.out.println("Reverse of number is: "+sum);
		// to check number is palindrome or not?
		if(original_number == sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
		System.out.println("---------------------------------------");
		}
		s.close();

	}

}
