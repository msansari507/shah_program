// Assignment 77 WAP to check if two arrays are equal to each other at run time.
package string01;
import java.util.Arrays;
import java.util.Scanner;
public class CheckEqualityOfArrays {

	public static void main(String[] args) {
		System.out.println("Enter the size of first array");
		Scanner s = new Scanner(System.in);
		int array1[] = new int[s.nextInt()];
		System.out.println("Enter values in first array");
		for(int i=0;i<=array1.length-1;i++) {
			array1[i] = s.nextInt();
		}
		System.out.println("Enter the size of second array");
		int array2[] = new int[s.nextInt()];
		System.out.println("Enter values in second array");
		for(int i=0;i<=array2.length-1;i++) {
			array2[i] = s.nextInt();
		}
		s.close();
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		boolean b = Arrays.equals(array1, array2);
		if(b)
			System.out.println("Given Arrays are equal to each other");
		else
			System.out.println("Given Arrays are not equal to each other");

	}

}
