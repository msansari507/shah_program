// Assignment 92 WAP on List concepts using its methods
package collection001;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListConcepts {
public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>(); // upcasting
		System.out.println("---First way to add elements---");
		l.add("Tesla");
		l.add(5000);
		l.add(true);
		l.add(67.567);
		l.add('A');
		l.add(null);
		l.add(5000);
		l.add('R');
		System.out.println(l);
		System.out.println("---Second way to add elements---");
		l.add(0,"BMW");
		System.out.println(l);
		List<Object> p = new ArrayList<Object>();
		p.add("Mercedes");
		p.add("Ford");
		p.add("Maruti 800");
		p.add(null);
		System.out.println(p);
		System.out.println("---Third way to add elements---");
		p.addAll(l);
		System.out.println(p);
		System.out.println("---Fourth way to add elements---");
		p.addAll(1, l);
		System.out.println(p);
		List<String> q = new ArrayList<String>();
		q.add("Mercedes");
		q.add("Ford");
		q.add("BMW");
		System.out.println("Before Sorting: "+q);
		Collections.sort(q);
		System.out.println("After Sorting: "+q);		
	}

}
