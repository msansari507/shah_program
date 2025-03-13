// Assignment 82 WAP to find two given strings are Anagram to each other or not.
package string01;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = n.next();
		System.out.println("Enter second String");
		String s2 = n.next();
		n.close();
		/* converting both strings either in lower case or upper case and then sort , 
		 so that when user enters strings in any case Upper Case , Lower Case,CamelCase
		  it should work
		 for example. s1= Silent  , s2 = Listen
		 */
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length()!=s2.length())
			System.out.println("They are not Anagram.");
		else {
			char c1[] = s1.toCharArray();//will convert given string into array of char
			char c2[] = s2.toCharArray();
			
			Arrays.sort(c1); // will sort the characters present in the array
			Arrays.sort(c2);
			boolean b1 = Arrays.equals(c1,c2);
			if(b1)
				System.out.println("They are Anagram");
			else
				System.out.println("They are not Anagram");
		}
	}

}
