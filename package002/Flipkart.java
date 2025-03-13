// Assignment 44 WAP on this calling statement.
package package002;

public class Flipkart {
	Flipkart(String login, int payment){
		System.out.println("Hi " + login + " Welcome to Flipkart!!");
		System.out.println("Checkout your products.");
	}
	Flipkart(String login){
		this(login, 5000);
		System.out.println("Your items are added to the cart.");
		System.out.println("Your total bill is Rs. 5000.");
	}
	Flipkart(String login, String pwd){
		this(login);
		System.out.println("Thanks for using Flipkart.");
		}
public static void main(String[] args) {
	new Flipkart("abc@kart.com","qw#23");
}
}
