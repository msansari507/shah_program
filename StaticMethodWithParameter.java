// Assignment 15
// WAP to call three static method having parameters,  inside the main method.
package package001;

public class StaticMethodWithParameter {
	static void area_of_square(int r) {
		int area = r * r;
		System.out.print("area of square : ");
		System.out.println(area);
	}
	static void area_of_rectangle(int l , int b) {
		int area = l * b;
		System.out.print("area of rectangle : ");
		System.out.println(area);
	}
	
	static void student_details(String name, int roll_num , char grade) {
		System.out.println("Student Details:-");
		System.out.println(name);
		System.out.println(roll_num);
		System.out.println(grade);
		}
public static void main(String[] args) {
	area_of_square(5); // calling static method1
	area_of_rectangle(6,12); // calling static method2
	student_details("Alan",1612731,'A'); // calling static method3
}
}
