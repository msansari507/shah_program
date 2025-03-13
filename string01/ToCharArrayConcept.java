// Assignment 73 WAP on String function toCharArray concept
package string01;

public class ToCharArrayConcept {

	public static void main(String[] args) {
/* Write a Java program that counts the number of vowels (a, e, i, o, u) 
		in a given string using toCharArray()*/
		
		String name = "Orange butterflies fluttered around the orange trees";
		char c[] = name.toCharArray();// converts String into char Array
		int count = 0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'
					||c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
				count++;
		}
		System.out.println("Occurence of vowels (a, e, i, o, u): "+count);

	}

}
