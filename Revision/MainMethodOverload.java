// WAP to overload the main method.
package Revision;

public class MainMethodOverload {
	public static void main(int[] args) {
		System.out.println("Block A executed");
	}
	public static void main(double[] args) {
		System.out.println("Block B executed");
	}
	public static void main(char[] args) {
		System.out.println("Block C executed");
	}
	public static void main(String[] args) { 
		// JVM always first call main method having arguments (String[] args)
		System.out.println("Block D executed");
		main(new int[0]); // calling explicitly other methods
		main(new double[0]);
		main(new char[0]);
	}

}
