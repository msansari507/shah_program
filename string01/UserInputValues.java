// Assignment76 WAP to accept the values of array at run time.
package string01;
import java.util.Arrays;
import java.util.Scanner;
public class UserInputValues {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		String []name = new String[s.nextInt()];
		System.out.println("Enter names of "+name.length + " students.");
		for(int i=0;i<=name.length-1;i++) {
			name[i] = s.next();
		}
		System.out.println("Students Names: "+Arrays.toString(name));
		s.close();
	}

}
