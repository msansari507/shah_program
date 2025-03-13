package Revision;

public class NonStaticMethod_01 {
	void add() { // Non Parameterized Non static method
		int a = 100;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
	void mul(int a , int b, int c) { // Parameterized Non static method
		int m = a*b*c;
		if(m>200) {
			System.out.println(m);
			System.out.println("Multiplication is greater than 200");
		}
		else
			System.out.println(m);
	}
	void details(String name, int roll_num, char grade) { // Parameterized Non static method
		System.out.println(name);
		System.out.println(roll_num);
		System.out.println(grade);
		if(grade == 'A')
			System.out.println("--Excellent--");
		else if(grade == 'B')
			System.out.println("--Good--");
		else
			System.out.println("--Retest--");
	}
	public static void main(String[] args) {
		NonStaticMethod_01 n = new NonStaticMethod_01(); // creating an object using reference variable n
		n.add(); // calling non static methods
		n.mul(15, 7, 4);
		n.details("Amar",1234,'B');
		n.details("Akbar",1234,'A');
		n.details("Anthony",1234,'A');
		n.details("Aarti",1234,'B');
		n.details("Arnav",1234,'D');
	}
}
