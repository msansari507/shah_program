// Assignment 36 WAP to print area of Rectangle using Scanner Class.
package package002;

import java.util.Scanner;

public class AreaRectangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int l = s.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b = s.nextInt();
		int area = l * b;
		System.out.print("Area of given Rectangle is: ");
		System.out.println(area);
		s.close();
	}

}
