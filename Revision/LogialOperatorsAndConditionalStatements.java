package Revision;

public class LogialOperatorsAndConditionalStatements {
	public static void main(String[] args) {
		int a = 300;
		int b = 200;
		int c= 250;
		if(!(a!=b && a==c)) {
			if(a<100)
			System.out.println("If under If Block Executed");
			else
				System.out.println("Else under If Block Executed");
		}
		else if(b==c || c!=300) {
			System.out.println("Else-If Block Executed");
		}
		else
			System.out.println("Else block executed");
	}
	

}
