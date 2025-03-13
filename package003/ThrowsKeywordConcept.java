// Assignment 63 WAP on throws keyword concept.
package package003;

public class ThrowsKeywordConcept {
	
	static void divide(int a , int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("Error: Division by zero is not allowed");
		}
		else {
			int div = a/b;
			System.out.println("Division of numbers are: "+div);
		}
	}

	public static void main(String[] args) {
		try {
			divide(5,0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
