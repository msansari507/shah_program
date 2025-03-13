// Assignment 35 WAPto print circumference/ perimeter of square using Scanner Class.
package package002;

import java.util.Scanner;

public class PerimeterSquare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side of Square");
		int a = s.nextInt();
		int p = 4*a;
		System.out.print("Circumference/Perimeter of given Square is: ");
		System.out.println(p);
		s.close();
	}
}
