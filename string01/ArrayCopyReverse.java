// Assignment 79 WAP to copy one array into another array in reverse order
package string01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyReverse {
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
				for(int i=0,j=array1.length-1;i<array1.length;i++,j--) {
					array2[j] = array1[i];
				}
				System.out.println("Array1: "+Arrays.toString(array1));
				System.out.println("Copied Array(in reverse order): "+Arrays.toString(array2));
			}

		


	}

