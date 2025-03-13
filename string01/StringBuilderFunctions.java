//Assignment87WAP on StringBuffer using append, insert, delete, substring, reverse, Capacity, replace
package string01;

public class StringBuilderFunctions {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Java Program @2025");
		System.out.println(s1.append("...Hello World!"));
		System.out.println(s1); // String Buffer is mutable in nature, original value change after append
		
		System.out.println(s1.insert(13, "##")); 
		System.out.println(s1.delete(13, 16)); //delete special characters
		System.out.println(s1.substring(s1.length()-12));
		System.out.println(s1);
		System.out.println(s1.reverse());
		System.out.println(s1);// showing mutable nature
		System.out.println(s1.reverse());
		System.out.println(s1); 
		System.out.println(s1.capacity()); //no of characters that can store
		System.out.println(s1.replace(5, 12, "Language"));//replace Program with Language

	}

}
