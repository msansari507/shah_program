// Assignment 78 WAP to copy one array into another array
package string01;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCopy {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int array1[] = new int[s.nextInt()];
		System.out.println("Enter the values of array");
		for(int i =0;i<array1.length;i++) {
			array1[i] = s.nextInt();		
			}
		s.close();
		int array2[] = new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array2[i] = array1[i];
		}
		System.out.println("Array1: "+Arrays.toString(array1));
		System.out.println("Copied Array: "+Arrays.toString(array2));
	}

}
