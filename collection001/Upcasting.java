/* Assignment 89 WAP on collection concept with the help of Upcasting on different Data Types (int,char, double,string,etc) 
 with different methods like add(),remove(),contains().*/
package collection001;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Upcasting {
	public static void main(String[] args) {
		
		Collection<Integer> c2 = new ArrayList<Integer>();// Upcasting
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter the age of Employee"+i+": ");
			c2.add(s.nextInt());
		}
	
		Collection<String> c3 = new ArrayList<String>();
		for(int i =1 ; i<=3; i++) {
			System.out.println("Enter the name of Employee"+i+": ");
			c3.add(s.next());
		}
		
		Collection<Double> c4 = new ArrayList<Double>();
		for(int i =1 ; i<=3; i++) {
			System.out.println("Enter the Salary Increment% of Employee"+i+": ");
			c4.add(s.nextDouble());
		}
		s.close();
		System.out.println("Employees Age: "+c2);
		System.out.println("Employees Name: "+c3);
		System.out.println("Salary Increment%: "+c4);
	
		System.out.println("is Employee with age of 27 present: "+c2.contains(27));
		c2.remove(27);
		System.out.println("After removing....");
		System.out.println("is Employee with age of 27 present: "+c2.contains(27));
		
	}
}
