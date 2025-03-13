//Assignment 99 WAP on map concepts using its method.
package map001;
import java.util.HashMap;
import java.util.Map;
public class MapConcepts {
	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer, String>();
		m1.put(5432, "Rohit");
		m1.put(6543, "Mayur");
		m1.put(7065, "Nida");
		m1.put(6120, "Angel");
		m1.put(8168, "Shama");
		System.out.println("m1: "+m1);
		
		Map<Integer,String> m2 = new HashMap<Integer, String>();
		m2.put(50432, "Abiha");
		m2.put(60543, "Dean");
		m2.put(70065, null);
		System.out.println("m2: "+m2);
		m2.putAll(m1);
		System.out.println("m2 after adding m1: "+m2);
		m2.remove(7065);
		System.out.println("m2 after removing one element: "+m2);
		m2.replace(6120, "Sakshi");
		m2.replace(60543, "Dean", "Dean Mach");
		System.out.println("m2 after replacing elements: "+m2);
		m2.clear();//remove all elements of m2
		System.out.println("After removing all elments from m2: "+m2);

	}

}
