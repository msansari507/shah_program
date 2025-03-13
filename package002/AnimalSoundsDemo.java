// Assignment 47 WAP on super keyword
package package002;
class Animal{
	void makeSound(){
		System.out.println("Animal Sounds:- ");
	}
}
class Dog extends Animal{
	void makeSound() {
		super.makeSound(); // calling parent class method using super keyword
		System.out.println("Dogs Bark");
		
	}
}	
class Cow extends Animal{
	void makeSound() {
		super.makeSound(); // calling parent class method using super keyword
		System.out.println("Cow Moo");
	}
}

class Cat extends Animal{
	void makeSound() {
		super.makeSound(); // calling parent class method using super keyword
		System.out.println("Cat Meow");
	}
}
public class AnimalSoundsDemo{
public static void main(String[] args) {
		Dog d = new Dog(); // calling sub class methods
		Cow w = new Cow();
		Cat c = new Cat();
		d.makeSound();
		w.makeSound();
		c.makeSound();
	}

}

