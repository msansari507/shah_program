// Assignment68 WAP on string functions using concat & contains concepts.
package string01;

public class StringFunctions2 {

	public static void main(String[] args) {
		
		String first_name = "Shahnawaz";
		String last_name = "Ansari";
		String full_name = first_name.concat(" ").concat(last_name);
		System.out.println("First Name: "+first_name);
		System.out.println("Last Name: "+last_name);
		boolean b1 = full_name.contains("Ansari");//return true or false
		if(b1) {
			System.out.println("Your Full Name is: "+full_name);
		}
		else
			System.out.println("'Ansari' is not present in your name");
			
	}

}
