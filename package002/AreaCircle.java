// Assignment 30 WAP to print Area of circle using Scanner Class.
package package002;

import java.util.Scanner;

public class AreaCircle {
public static void main(String[] args) {
	
	Scanner s1 = new Scanner(System.in); 
	System.out.println("Enter the radius of the circle");
	int r = s1.nextInt();
	double area = Math.PI*r*r;
	System.out.print("Area of circle is: ");
	System.out.println(area);
    s1.close();
}
}
