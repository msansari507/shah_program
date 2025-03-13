// Assignment 9 WAP on Logical Operators.
package package001;

public class LogicalOperators {
public static void main(String[] args) {
	int a = 100;
	int b = 200;
	
	if(a==100 && b>a) { // AND && Operator
		System.out.println("AND Block executed");
	}
	if(a==b|| b>a) { // OR || Operator
		System.out.println("OR Block exeuted");
	}
	if(!(a==100 && b<a)) { // AND with NOT operator 
		System.out.println("AND with NOT Block executed");
	}
	if(!(a!=100 || b<a)) { // OR with NOT operator
		System.out.println("OR with NOT Block executed");
	}
}
}
