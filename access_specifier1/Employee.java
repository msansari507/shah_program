//Assignment 56 WAP on Access Specifier outside the package by becoming the subclass,for methods
package access_specifier1;
import access_specifier2.Organizations; // importing the class of other package
public class Employee extends Organizations  {
public static void main(String[] args) {
	orgDetails(); // calling public method of class present in outside the package
	employeeDetails(); //calling protected method of class present in outside the package
}
}
