// Assignment 33 WAP to print circumference/ perimeter of a triangle.
package package002;

import java.util.Scanner;

public class TrianglePerimeter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of 1st side of triangle");
		int a= s.nextInt();
		System.out.println("Enter the value of 2nd side of triangle");
		int b= s.nextInt();
		System.out.println("Enter the value of 3rd side of triangle");
		int c= s.nextInt();
		int p = a + b + c;
		System.out.print("Circumference/Perimeter of the given triangle is: ");
		System.out.println(p);
		s.close();
	}

}
