/*Assignment67 WAP on String Functions toUpperCase,toLowerCase,length,charAt,trim */
package string01;

public class StringFunctions1 {

	public static void main(String[] args) {
		
     String name = "Md Shahnawaz Ansari";
     System.out.println("Name: "+name);
     System.out.println("Name in Upper Case: "+name.toUpperCase());
     System.out.println("Name in Lower Case: "+name.toLowerCase());
     System.out.println("Length of name is: "+name.length());
     System.out.println("Character position at 14: "+name.charAt(14));
     String Address = "  Ranchi Jharkhand   ";
     System.out.println("Your Address is: "+Address);
     System.out.println("Remove spaces from front and end, Address:"+Address.trim());
	}

}
