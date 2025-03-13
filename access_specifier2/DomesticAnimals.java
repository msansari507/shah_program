// Assignment 59 WAP on Access Specifiers outside the package for Class.
package access_specifier2;

import access_specifier1.Animal;

class DomesticAnimals {

	public static void main(String[] args) {
		System.out.println("This is domestic Animal Class and its default in nature "
				+ "and present in other package");
		
		Animal.main(args); // able to access Public class of other package
		
		//WildAnimal //not able to access default class of other package
	}

}
