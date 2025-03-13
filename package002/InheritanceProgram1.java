package package002; // Assignment 38 WAP on Inheritance concept.
import java.util.Scanner;
class Program0{
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();           
	int b = s.nextInt();
	static void add() {
		Program0 g = new Program0();
		int sum = g.a+ g.b;
		System.out.println("Sum of two numbers");
		System.out.println(sum);
	}
	void sub() {
		int sub = a - b;
		System.out.println("Difference of two numbers");
		System.out.println(sub);
	}
	}
class InheritanceProgram1 extends Program0{
	static void mul() {
		Program0 g = new Program0();
		int mul = g.a * g.b;
		System.out.println("Multiplication of two numbers");
		System.out.println(mul);
		System.out.println("Again calling Add & Sub methods from child class.");
		System.out.println("Again add value of a & b for addition");
		add();
		System.out.println("Again add value of a & b for subtraction");
		Program0 h = new Program0(); // creating new object h to call method sub
		h.sub(); // if we call using same variable g then it will take previous value
	}
public static void main(String[] args) {
System.out.println("Enter the value of a & b for addition");
add();
System.out.println("Enter the value of a & b for substraction");
Program0 g = new Program0();
g.sub();
System.out.println("Enter the value of a & b for multiplication");
mul();}}