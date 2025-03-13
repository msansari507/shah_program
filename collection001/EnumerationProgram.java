// Assignment 100 WAP on Enumeration
package collection001;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProgram {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add(10);
		v.add("Jyoti");
		v.add(15.2);
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
