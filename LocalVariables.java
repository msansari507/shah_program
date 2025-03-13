// Assignment 17
// WAP to declare a variable inside a static and non static variable for Local Variables.
package package001;
public class LocalVariables {
 static void add() {
	 int a, b; // a & b are local variable
	 a= 10;
	 b= 30;
	 System.out.print("add: ");
	 System.out.println(a + b);
 }
  void sub() {
	 int a, b; 
	 a= 50;
	 b= 90;
	 System.out.print("sub: ");
	 System.out.println(a - b);
 }
 public static void main(String[] args) {
	 add();
	 LocalVariables n = new LocalVariables();
	 n.sub();
 }
}
