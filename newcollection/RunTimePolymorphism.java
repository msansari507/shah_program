// Assignment 117 WAP on Run time polymorphism (Method overriding)
package newcollection;

class ParentClass1{
	void sum(int a, int b) {
		System.out.println("Parent Class method...");
		int sum = a + b;
		System.out.println("Sum of numbers: "+sum);
	}
}

public class RunTimePolymorphism extends ParentClass1 {
	void sum(int a, int b) {
		super.sum(20,30);
		System.out.println("Child Class method...");
		int sum = a+b;
		System.out.println("Sum of numbers: "+sum);
		
	}

	public static void main(String[] args) {
		RunTimePolymorphism r = new RunTimePolymorphism();
		r.sum(12,13);

	}

}
