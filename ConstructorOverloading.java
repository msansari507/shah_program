// Assignment 19
// WAP on Constructor Overloading.
package package001;
public class ConstructorOverloading {
	ConstructorOverloading(){
	 System.out.println("This is my 1st constructor");
 }
	ConstructorOverloading(int a){
	 System.out.println("This is my 2nd constructor");
 }
	ConstructorOverloading(int a, int b){
		 System.out.println("This is my 3rd constructor");
	 }
	ConstructorOverloading(double a, int b){
		 System.out.println("This is my 4th constructor");
	 }
	ConstructorOverloading(int a, double b){
		 System.out.println("This is my 5th constructor");
	 }
public static void main(String[] args) {
	new ConstructorOverloading();
	new ConstructorOverloading(10);
	new ConstructorOverloading(10,20);
	new ConstructorOverloading(2.5,50);
	new ConstructorOverloading(25,5.5);
}
}
