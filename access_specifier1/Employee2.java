//Assignment 57 WAP on Access Specifier outside the package without becoming the subclass,for methods
package access_specifier1;

import access_specifier2.Organizations;

public class Employee2 {

	public static void main(String[] args) {
		Organizations.orgDetails(); //able to access only public method of class of from other package
//		Organizations.
	}

}
