// Assignment 37 WAP to print circumference/perimeter of a rectangle using Scanner Class.
package package002;

import java.util.Scanner;

public class PerimeterRectangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int l = s.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b = s.nextInt();
		System.out.print("Perimeter of given rectangle is: ");
		int p = 2*(l + b);
		System.out.println(p);
		s.close();
	}

}
