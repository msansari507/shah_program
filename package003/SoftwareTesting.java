// Assignment 52 
//WAP on Multilevel Inheritance using the concept of Inheritance.
package package003;
interface SanityTesting{ // Interface 1
	void sanityCheck();
}
interface EndToEndTesting extends SanityTesting{ //Interface 2
	void  functionalChecks();
	void integrationChecks();
	void systemChecks();
}
public class SoftwareTesting implements EndToEndTesting { // Class

	public void sanityCheck() {
		System.out.println("Perform a quick sanity checks to make sure main case is working fine");
	}

	public void functionalChecks() {
		System.out.println("Test the functionality of each component.");
	}

	public void integrationChecks() {
	  System.out.println("Test the funtional and data flow between two or more than two modules");
	}

	public void systemChecks() {
		System.out.println("Test the complete end to end flow of the system.");
	}
public static void main(String[] args) {
	SoftwareTesting st = new SoftwareTesting();
	st.sanityCheck();
	st.functionalChecks();
	st.integrationChecks();
	st.systemChecks();
}
}
