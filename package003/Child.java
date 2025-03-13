// Assignment 53 WAP on Multiple Level Inheritance
package package003;
interface Mother{
	void momBehavior();
}
interface Father{
	void dadBehavior();
}
public class Child implements Mother,Father {
	public void dadBehavior() {
		System.out.println("Child inherits the behavior of dad");
	}
	public void momBehavior() {
		System.out.println("Child inherits the behavior of mom");
	}
public static void main(String[] args) {
	Child c = new Child();
	c.momBehavior();
	c.dadBehavior();
}
}
