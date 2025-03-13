// Assignment 88 WAP on constructors of a String Buffer and constructors of a String Builder
package string01;

public class BuffersBuildersConstructors {

	public static void main(String[] args) {
		//Constructors of StringBuffer
		StringBuffer s1= new StringBuffer();
		System.out.println(s1.append("This is Empty String Buffer"));
		StringBuffer s2 = new StringBuffer("This is String Buffer with specified string");
		System.out.println(s2);
		StringBuffer s3 = new StringBuffer(22); //empty Buffer with specified capacity of length
		System.out.println(s3.capacity());
		s3.append("The Quick Brown Fox Jumps over the Lazy Dog");
		System.out.println(s3.length());
		System.out.println(s3.capacity());
		
		// Constructors of StringBuilders
		StringBuilder b1= new StringBuilder();
		System.out.println(b1.append("This is Empty StringBuilder"));
		StringBuilder b2 = new StringBuilder("This is StringBuilder with specified string");
		System.out.println(b2);
		StringBuilder b3 = new StringBuilder(26); //empty Builder  with specified capacity of length
		System.out.println(b3.capacity());

	}

}
