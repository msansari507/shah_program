// WAP to check person can vote only if he/she is 18 or above and should not vote if age is less.
// Assignment 10
package package001;

public class VotingAge {
public static void main(String[] args) {
	int age = 19;
	if(age == 18 || age>18) { // if(age>=18) 
		System.out.println("Elgible for voting");
	}
	else {
		System.out.println("Not Elgible for voting");
	}
}
}
