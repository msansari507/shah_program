package package002; // Assignment 41 WAP on Hierarchical Inheritance.
class Patient{ // Super Class
	static void details(String name, String pblm) {
		System.out.println("Patient Name: " +name);
		System.out.println("Patient's Problem: " +pblm);
	}
}

class Medicine extends Patient{ // Sub Class1
	void drug() {
		System.out.println("Patient is taking medicine.");
	}
}
public class Hospital extends Patient { // Sub Class 2
	static void surgery() {
		System.out.println("Liver Trasplant is done");
	}
public static void main(String[] args) {
	details("Alan", "Liver Infection");
	surgery();
	Medicine m = new Medicine();
	m.drug();
}
}
