// Assignment 34 WAP to print area of square using Scanner Class.
package package002;

import java.util.Scanner;

public class AreaSquare {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the side of square");
		int a = s.nextInt();
		System.out.print("Area of given Square is: ");
		int area = a * a;
		System.out.println(area);
		s.close();
	}

}
