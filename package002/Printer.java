package package002; // Assignment 40 WAP on Multilevel Inheritance
import java.util.Scanner;
class Electricity{
	Scanner v = new Scanner(System.in);
	int voltage = v.nextInt();
	static int s;
	static void power() {
		Electricity e = new Electricity();
		if(e.voltage>=220 && e.voltage<=240) {
			System.out.println("Power is On");
			s = 1;
		}
		else {
			System.out.println("Power is Off");
			s = 0;
			}
	}
}
class Switch extends Electricity{
	static int b;
	static void onSwitch() {
		if(s==1) {
			b= 1;
			System.out.println("Switch is On");
		}
		else
			System.out.println("Switch is Off");
	}
	}
public class Printer extends Switch {
	static void print() {
		if(b==1)
		System.out.println("Printer is printing.");
		else
			System.out.println("Printer is Off.");
		}
public static void main(String[] args) {
		System.out.println("Enter the voltage: ");
		power();onSwitch();print();
	}

}
