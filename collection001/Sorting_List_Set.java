// Assignment 97 WAP to sort the List and Set.
package collection001;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Sorting_List_Set {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(55);
		l.add(10);
		l.add(0);
		l.add(-76);
		l.add(112);
		l.add(97);
		l.add(55);
		System.out.println("Before Sorting the List: "+l);
		Collections.sort(l);
		System.out.println("After Sorting the List: "+l);
		
		Set<Integer> r = new HashSet<Integer>();
		r.add(55);
		r.add(10);
		r.add(0);
		r.add(-76);
		r.add(112);
		r.add(97);
		r.add(55);
		System.out.println("Before Sorting the Set: "+r);
		// convert Set into List for sorting
		// As there is no direct method for sorting of HashSet
		
		List<Integer> p = new ArrayList<Integer>(r);
		Collections.sort(p);
		System.out.println("After Sorting the Set: "+p);
		

	}

}
