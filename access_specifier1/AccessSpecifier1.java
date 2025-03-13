//Assignment 54 WAP on Access Specifiers within class for methods.
package access_specifier1;
import java.util.Scanner;
public class AccessSpecifier1 {
	static int a,b,h,r;
	public static void areaOfRectangle() {
		int area = a * b;
		System.out.println("Area of given Rectangle is: " +area);
	}
   protected static void areaOfSquare() {
	   int area = a * a;
		System.out.println("Area of given Square is: " +area);
	}
   static void areaOfTriangle() {
	   float area = 0.5f *b * h;
		System.out.println("Area of given Triangle is: " +area);
	}
   private static void areaOfCircle() {
	   float area = 3.14f *r * r;
		System.out.println("Area of given Circle is: " +area);
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the sides of rectangle");
	a = s.nextInt();
	b = s.nextInt();
	areaOfRectangle(); // calling public method
	System.out.println("Enter the side of Square");
	a = s.nextInt();
	areaOfSquare(); // calling protected method
	System.out.println("Enter the base and height of Triangle");
	b = s.nextInt();
	h = s.nextInt();
	areaOfTriangle(); // calling package method
	System.out.println("Enter the radius of the circle");
	r = s.nextInt();
	areaOfCircle(); // calling private method
	s.close();
	}
}
