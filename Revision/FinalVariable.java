// Assignment 20 WAP on Final Variables.
package Revision;

public class FinalVariable {
	final double g = 9.8;
	final float a = 11.5f;
	void add() {
		final int b = 20;
//		a = 10.5f; this is not allow as a is declared as final variable.
//		b = 10; this is not allow as b is declared as final variable.
		System.out.println(g);
		System.out.println(a);
		System.out.println(b);
		double sum = g + a;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.add();
	}

}
