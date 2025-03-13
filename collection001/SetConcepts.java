//Assignment95 WAP on Set Concepts using its method
package collection001;
import java.util.HashSet;
import java.util.Set;
public class SetConcepts {

	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>();
		t.add(76);
		t.add(93);
		t.add(null);
		t.add(140);
		t.add(93);
		t.add(65);
		System.out.println(t);
		if(t.contains(null))
			System.out.println("Set has null value");
		if(t.isEmpty())
			System.out.println("Set is Empty");
		else
			System.out.println("Set is not empty");
		t.remove(93);
		System.out.println("After removing an element: "+t);
		System.out.println("Size of Set: "+t.size());
		
		Set<String> s = new HashSet<String>();
		s.add("Alan");
		s.add("Walker");
		s.add("Elie");
		System.out.println("Set s: "+s);
		
		Set<String> g = new HashSet<String>();
		g.add("Taylor");
		g.add("Selena");
		g.add(null);
		System.out.println("Set g: "+g);
		s.addAll(g);
		System.out.println("Updated set of s: "+s);

	}

}
