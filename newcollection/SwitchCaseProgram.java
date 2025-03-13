package newcollection; // Assignment 106 WAP on Switch Case statement
import java.util.Scanner;
public class SwitchCaseProgram {
	static int a, b; //declaring global variables 
	public static void main(String[] args) {
System.out.println("Press 1 for Addition, 2 for Substraction,3 for Multiplication, 4 for Division");
		Scanner s = new Scanner(System.in);
		switch(s.nextByte()) {
			case 1:
				System.out.println("Enter two numbers");
				a = s.nextInt();
				b = s.nextInt();
				int sum = a + b;
				System.out.println("Addition of given numbers: "+sum);
			break;
			case 2:
				System.out.println("Enter two numbers");
				a = s.nextInt();
				b = s.nextInt();
				int sub = a - b;
				System.out.println("substraction of given numbers: "+sub);
			break;
			case 3:
				System.out.println("Enter two numbers");
				a = s.nextInt();
				b = s.nextInt();
				int mul = a * b;
				System.out.println("Multiplication of given numbers: "+mul);
			break;
			case 4:
				System.out.println("Enter two numbers");
				a = s.nextInt();
				b = s.nextInt();
				int div = a / b;
				System.out.println("Division of given numbers: "+div);
			break;
			default:
				System.out.println("Wrong Choice..!!");
			}
		s.close();
		
	}

}
