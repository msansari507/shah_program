// Assignment 118 WAP on Compile time polymorphism (Method overloading)
package newcollection;

public class CompileTimePolymorphism {
	static void login(long mobile_number) {
		System.out.println("Login with Mobile Number: "+mobile_number);
	}
	static void login(String email) {
		System.out.println("Login with Email Id: "+email);
	}
	public static void main(String[] args) {
		login(902637292);
		login("abc@xyz.com");
		

	}

}
