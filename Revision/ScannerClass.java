package Revision;
import java.util.Scanner;
public class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println("The Sum of two nos is: "+ sum);
		s.close();
	}

}
