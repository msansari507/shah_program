// Assignment 18 
// WAP to declare local variables

package package001;
public class GlobalVariable {
	static int a=10; // a & b global variables
	static int b =20;
static void add() {
	 int sum = a + b; // sum local variable
	 System.out.print("add: ");
	 System.out.println(sum);
}
void sub() {
	 int sub = a - b; // sub local variable
	 System.out.print("sub: ");
	 System.out.println(sub);
}
public static void main(String[] args) {
	 add();
	 GlobalVariable n = new GlobalVariable();
	 n.sub();
}
}
