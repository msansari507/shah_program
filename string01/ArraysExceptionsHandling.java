// Assignment 81 WAP on ArrayIndexOutOfBoundsException with a try catch
package string01;
import java.util.Scanner;
public class ArraysExceptionsHandling {
	public static void main(String[] args) {
		try {
		Scanner s = new Scanner(System.in);
		String Employee[] = new String[5];
		System.out.println("Enter Employee names");
		for(int i =0;i<=Employee.length;i++) {
			Employee[i] = s.next();
		}
		s.close();
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Please check the code getting exception: "+a.getMessage());
		}
	}
}
