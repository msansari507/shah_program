// Assignment 55 WAP on Access Specifiers within package for methods
package access_specifier1;

public class User {

	public static void main(String[] args) {
		ECommerce.loginToPlatform(); // calling the public method using class name
		ECommerce.buyProducts(); // calling the protected method using class name
		ECommerce.updateProfileDetails();//default method using class name
	}

}
