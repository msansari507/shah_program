// Assignment 58 WAP on Access Specifiers within package for a class
package access_specifier1;

public class Animal { // public class
   static void animalSounds() {
    	System.out.println("Different animals sound differently");
    }
	public static void main(String[] args) {
		System.out.println("This is Animal Class and its Public in nature");
		WildAnimal n = new WildAnimal();
		n.wildAnimalSounds(); // calling the method of package/default class

	}

}
