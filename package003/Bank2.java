// Assignment50 WAP on Abstract Class with both Abstract and Concrete methods
package package003;
abstract class AccountHolder{
	abstract void accountDetails(); // abstract methods
	abstract void KYC();  // abstract method
	void balanceEnquiry() {  // concrete method
		System.out.println("---Check your balance--- ");
		System.out.println("Total Amount: 5234 Rs.");
	}
	void newOffer() {  // concrete method
		System.out.println("----New Offers----");
		System.out.println("Credit Card Offers");
		System.out.println("New Loan Offers");
	}
}

public class Bank2 extends AccountHolder {
public static void main(String[] args) {
	AccountHolder a = new Bank2();
	a.accountDetails();
	a.newOffer();
	a.balanceEnquiry();
	a.KYC();
	}
void accountDetails() {
	System.out.println("----Account Details---");
	System.out.println("Account Number: 356383839930302");
	System.out.println("IFSC: STHE79972");
	System.out.println("Account Type: Saving");
	}
void KYC() {
	System.out.println("---Know your Customer---");
	System.out.println("PAN Card: BGHT564");
	System.out.println("Aadhar Card: 2134 6547 8986");
	System.out.println("Address: AG Colony Ranchi Jharkhand");
	System.out.println("Your KYC is completed");
}
}
