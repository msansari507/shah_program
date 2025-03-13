package Revision;

public class StaticMethod_01 {
	static void add() { // Non Parameterized method
		int a = 50;
		int b = 60;
		System.out.println(a+b);
	}
	static void sub(int a, int b) { // Parameterized method
		System.out.println(a-b);
	}
	static void details(String name,int id, char group) { // Parameterized method
		System.out.println(name);
		System.out.println(id);
		System.out.println(group);
	}
	public static void main(String[] args) {
		add();
		sub(120,70);
		details("Alan",238765,'H');
	}
}
