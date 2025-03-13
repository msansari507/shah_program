//Assignment 98 WAP to store Account no and name inside map by passing the values at run time.
package map001;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountDetails {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		Scanner s = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("Enter the Account Number and Name of account"+i);
			m1.put(s.nextInt(), s.next());
		}
		s.close();
		System.out.println("Account Details are: ");
		System.out.println(m1);
	}

}
