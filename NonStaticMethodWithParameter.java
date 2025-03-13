// Assignment 14 
// WAP to call four non static method having parameters,  inside the main method.
package package001;

public class NonStaticMethodWithParameter {
 void add(int a, int b) {
	 int sum = a + b;
	 System.out.println(sum);
 }
 void sub(int a, int b) {
	 int sub = a - b;
	 System.out.println(sub);
 }
 void mul(int a, int b) {
	 int mul = a * b;
	 System.out.println(mul);
 }
 void employee_info(String name, String Designation, int emp_id) {
    System.out.println("Employee details:-");
    System.out.println(name);
    System.out.println(Designation);
    System.out.println(emp_id);
 }
 
 public static void main(String[] args) {
	 NonStaticMethodWithParameter n = new NonStaticMethodWithParameter();
	 n.add(30,50);
	 n.sub(30,50);
	 n.mul(30,50);
	 n.employee_info("Alan", "QA", 98745);
	 
 }
}
