// Assignment 49 WAP on Abstract Class and Abstract Method
package package003;
abstract class ATM{
	abstract void checkBalance();
	abstract void withdraw();
}

public class Bank extends ATM {
public static void main(String[] args) {
	Bank a = new Bank(); // or ATM a = new Bank();
   a.checkBalance();
   a.withdraw();
}
void checkBalance() {
	System.out.println("Your available balance is 5227 Rs.");
}
void withdraw() {
	System.out.println("Enter amount to withdraw");
}
void accountDetails() {
	System.out.println("Account Number: 356383839930302");
	System.out.println("IFSC: STHE79972");
	System.out.println("Account Type: Saving");
}
}
