// WAP to call the static method inside the main() method. Assignment 3
package package001;
public class ArithmeticOperators {
	static void add() { // Access specifier is blank that means package/default
		int a=10;
		int b=20;
		int sum = a + b;
		System.out.println("WAP to call the static method inside the main() method.Assignment 3");
		System.out.println("sum() method is called from the main() method-");
		System.out.println(sum); // this line will not print directly because currently its not on main function
	}
	static void sub() {
		int a=10;
		int b=20;
		int sub = a-b;
		System.out.println("sub() method is called from the main() method-");
		System.out.println(sub);
	}
	static void mul() {
		int a = 10;
		int b= 20;
		int mul = a*b;
		System.out.println("mul() method is called from the main() method-");
		System.out.println(mul);
		
	}
	static void div() {
		int a = 10;
		int b = 20;
		int div = b/a;
		System.out.println("div() method is called from the main() method-");
		System.out.println(div);
	}
	static void mod() {
		int a =10;
		int b = 20;
		int mod = b%a;
		System.out.println("mod() method is called from the main() method-");
		System.out.println(mod);
	}
	public static void main(String[] args) {
		//System.out.println("currently control is here inside the main function");
		//System.out.println ("Now we are calling add, sub, mul, div and mod earlier defined static functions one by one, to print the results-");
		add();
		sub();
		mul();
		div();
		mod();
	}
}
