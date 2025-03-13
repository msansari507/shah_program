// Assignment 13
// WAP with combination of static and non static methods both and try calling both of them.
package package001;

public class StaticNonStaticMethodsCombo {
	static void area() { // static method
		int A = 40;
		int B = 60;
		int area_of_rectangle = A * B;
		System.out.println(area_of_rectangle);
		
	}
	
	void perimeter() { // non static method
		int A = 40;
		int B = 60;
		int perimeter_of_rectangle = 2*(A + B);
		System.out.println(perimeter_of_rectangle);
		
	}
public static void main(String[] args) {
	area(); // calling static method
	StaticNonStaticMethodsCombo n = new StaticNonStaticMethodsCombo(); // creating an object
	n.perimeter(); // calling non static method using object
}

}
