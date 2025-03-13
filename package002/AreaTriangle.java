// Assignment 32 WAP to print Area of a Triangle using Scanner Class
package package002;

import java.util.Scanner;

public class AreaTriangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		int b = s.nextInt();
		System.out.println("Enter the height of triangle");
		int h =s.nextInt();
		double area = 0.5*b*h;
		System.out.print("Area of the given Triangle is: ");
		System.out.println(area);
		s.close();
	}

}
