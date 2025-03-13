// Assignment 91 WAP to iterate using Iterator
package collection001;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class IteratorProgram {

	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<Object>();
		c.add("Laptop");
		c.add(99865);
		c.add("16 GB Ram");
		c.add(10.65);
		Iterator<Object> i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
