// Assignment 45 WAP on Method Overriding.
package package002;
class Irctc{
	void book() {
		System.out.println("Airplane tickets are booking");
	}
}
public class TicketBooking extends Irctc {
	void book() {
		System.out.println("Train tickets are booking");
		super.book(); // super is keyword used to call the parent class method.
	}
	public static void main(String[] args) {
		TicketBooking t = new TicketBooking();
		t.book();
	}
}
