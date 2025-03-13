//Assignment 71 WAP to check given String is Palindrome or not.
package string01;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		s.close();
		String output ="";
		for(int i=input.length()-1;i>=0;i--) {
			char c1 = input.charAt(i);
			output +=c1;
		}
       System.out.println("Your String is: "+input);
       if(input.equals(output)) 
    	   System.out.println("The String is Palindrome");
       else
    	   System.out.println("The String is Not Palindrome");
	}

}
