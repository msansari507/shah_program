package Revision;

public class MethodOverloading_01 {
	void travel() {
		System.out.println("I am travelling");
	}
	static void travel(String vehicle) {
		System.out.print("I am going by ");
		System.out.println(vehicle);
	}
	static void travel(int time, String place) {
		System.out.print("I will reach in ");
		System.out.print(time);
		System.out.println(" minutes");
		System.out.print("Today I am going to ");
		System.out.println(place);
	}
	void travel(String place, int days) {
		System.out.print("Then I will go to ");
		System.out.print(place);
		System.out.print(" for ");
		System.out.print(days);
		System.out.println(" days.");
	}
	public static void main(String[] args) {
		MethodOverloading_01 t = new MethodOverloading_01();
		t.travel();
		travel("Local Train");
		travel(50,"Vashi");
		t.travel("Badlapur",2);
		
	}

}
