// Assignment 12
// WAP to call  three non static methods in the main method.
package package001;

public class NonStaticMethodProgram {
	void add() {
		int a = 10;
		int b = 20;
		System.out.println("nonstatic method1");
		System.out.println(a+b);
	}
	void sub() {
		int a = 300;
		int b = 20;
		System.out.println("nonstatic method2");
		System.out.println(a-b);
	}
	void mul() {
		int a = 5;
		int b = 9;
		System.out.println("nonstatic method3");
		System.out.println(a*b);
	}
public static void main(String[] args) {
	
	NonStaticMethodProgram n = new NonStaticMethodProgram(); //creating object
	n.add(); // calling the non static methods
	n.sub();
	n.mul();
}
}
