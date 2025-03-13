// WAP to print -20 to 20 
package Revision;

public class ForLoop {
	public static void main(String[] args) {
    for(int i = -20 ; i<= 20 ; i++) {
	System.out.print(i);
    System.out.print(" ");
    }
    System.out.println();
    System.out.println("Outside of first loop");
    
    int j=1;
    for(int i=1; i<=5; i++) {
    	for(j=1; j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
}
}