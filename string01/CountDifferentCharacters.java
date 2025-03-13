//Assignment 83 
//WAP to count the Alphabetic , Numeric, Spaces and Special Characters in the given String
package string01;
import java.util.Arrays;

public class CountDifferentCharacters {
	public static void main(String[] args) {
		int count_of_alphabet = 0;
		String s1 = "K@1V no 2;3&Ts0";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i = 0;i<c1.length;i++) {
			boolean b1 = Character.isAlphabetic(c1[i]); // Character is Wrapper Class
			if(b1)
				count_of_alphabet++;
		}
		System.out.println("Count of Alphabets: "+count_of_alphabet);		
		int count_of_digits =0;
		for(int i=0;i<c1.length;i++) {
			boolean b2 = Character.isDigit(c1[i]);
			if(b2)
				count_of_digits++;
		}
		System.out.println("Count of Digits: "+count_of_digits);
		int count_of_spaces =0;
		for(int i=0;i<c1.length;i++) {
			boolean b3 = Character.isSpaceChar(c1[i]);
			if(b3)
				count_of_spaces++;
		}
		System.out.println("Count of White Spaces: "+count_of_spaces);
		int count_of_special_chars = s1.length() - (count_of_alphabet + count_of_digits + 
				count_of_spaces)  ;
		
		System.out.println("Count of Special Characters: "+count_of_special_chars);

	}
}
