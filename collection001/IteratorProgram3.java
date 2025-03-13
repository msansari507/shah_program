//Assignment 96 WAP to iterate a Set using Iterator.
package collection001;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorProgram3 {

	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>();
		t.add(76);
		t.add(93);
		t.add(null);
		t.add(140);
		t.add(93);
		t.add(65);
		System.out.println(t);
		
		Iterator<Integer> i = t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
