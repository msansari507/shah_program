// Assignment 11
// WAP to call one non static method in the main method.
package package001;

public class NonStaticMethod {
void add() { // non static method
		int a = 100;
		int b = 250;
		System.out.println(a+b);
	}
public static void main(String[] args) {
	NonStaticMethod n = new NonStaticMethod(); // class_name reference_variable = new class_name();
	n.add(); // call non static method
}
}
