// Assignment 16
// WAP for method overloading static and non static methods.
package package001;

public class MethodOverloading {
	static void area(int r) { // static method
		int area = r * r;
		System.out.println("area of square");
		System.out.println(area);
	}
	static void area(int l, int b) { // static method
		int area = l * b;
		System.out.println("area of rectangle");
		System.out.println(area);
	}
	void area(double r) { // non static method
		double area = 3.14 * r * r;
		System.out.println("area of circle");
		System.out.println(area);
	}
	void area(double r, int h) { // non static method
		double area = 2 * 3.14 * r *(r + h);
		System.out.println("area of cylinder");
		System.out.println(area);
	}
	void area(int l, double r) { // non static method
		double area = 3.14 * r *(r + l);
		System.out.println("area of cone");
		System.out.println(area);
	}
public static void main(String[] args) {
	area(8); // calling static method
	area(12,8);
	MethodOverloading n = new MethodOverloading();
	n.area(2.5); // calling non static method
	n.area(2.5, 8);
	n.area(12,2.5);
	
}

}
