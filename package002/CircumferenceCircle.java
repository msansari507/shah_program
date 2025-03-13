// Assignment 31 WAP to print circumference of the circle using Scanner Class
package package002;
import java.util.Scanner;
public class CircumferenceCircle {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	int r = s1.nextInt();
	double circumference = 2*Math.PI*r;
	System.out.print("Circumference of the circle is: ");
	System.out.println(circumference);
	s1.close();
}
}
