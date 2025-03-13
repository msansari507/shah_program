// Assignment 65 WAP to terminate any program using throw keyword concept
package package003;

public class TerminateProgram { // using throw keyword concept
	static void vote(int age) throws NullPointerException,ArithmeticException {
		if(age>=18) {
			System.out.println("you are elgible for voting");
			throw new NullPointerException("Program terminated");
		}
		else {
			System.out.println("you are not elgible for voting");
			throw new ArithmeticException("Program terminated");
		}
	}

	public static void main(String[] args) {
		vote(8);

	}

}
