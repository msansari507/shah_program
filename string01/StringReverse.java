// Assignment 70 WAP to reverse any String
package string01;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println("Your given String is: "+input);
		s.close();
		String output = "";
		for(int i=input.length()-1; i>=0; i--) {
			char c = input.charAt(i);
			output = output + c;
		}
		System.out.println("Reverse of given String is: "+output);
	}

}
