//Assignment 93 WAP to iterate the list using Iterator.
package collection001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorProgram2 {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		
		l.add("Tesla");
		l.add(5000);
		l.add(true);
		l.add(67.567);
		l.add('A');
		l.add(null);
		l.add(5000);
		l.add('R');
		System.out.println(l);
		
		Iterator<Object> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
