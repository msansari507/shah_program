package Revision;

public class AmazonApp {
	AmazonApp(){ // Constructor: no return type, method name always same as class name, non static
		System.out.println("-- This is Amazon Home Page --");
		}
	AmazonApp(String Shopping){ // Constructor overloading
		System.out.println("Shop Now!!");
	}
	AmazonApp(int total, String status){
		System.out.println(total);
		System.out.println(status);
	}
public static void main(String[] args) {
	new AmazonApp(); // calling the constructor
	new AmazonApp("Dress");
	new AmazonApp(2345,"Out for Delivery");
}
}
