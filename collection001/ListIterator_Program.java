// Assignment 94 WAP to iterate a list using ListIterator.
package collection001;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class ListIterator_Program {

	public static void main(String[] args) {
		List<String> q = new ArrayList<String>();
		q.add("Mercedes");
		q.add("Ford");
		q.add("BMW");
		q.add("Maruti 800");
		q.add(null);
		q.add("Tesla");
		System.out.println(q);
		System.out.println("Forward Iteration...");
		ListIterator<String> i = q.listIterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("Backward Iteration...");
		while(i.hasPrevious())
			System.out.println(i.previous());

	}

}
