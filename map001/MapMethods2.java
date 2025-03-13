// Assignment 101 WAP using methods like get(),containsKey(),containsValue(),
// putIfAbsent(),equals()
package map001;
import java.util.HashMap;
import java.util.Map;
public class MapMethods2 {
  public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(2,"Standard User");
		m.put(4,"Admin User");
		m.put(5,"Org Admin User");
		System.out.println("Map m: "+m);
		if(m.containsKey(4) || m.containsValue("Org Admin User")) {
			System.out.println(m.get(4)); // return value for given keys
			System.out.println(m.get(5));
			System.out.println("They have admin access");
		}
		else
			System.out.println("Not Authorized to access Admin");
		
		Map<Integer,String> n = new HashMap<Integer,String>();
	    n.put(2,"Standard User");
		n.put(4,"Admin User");
		n.put(5,"Org Admin User");
		System.out.println("Map n: "+n);
		if(m.equals(n)) 
			System.out.println("Map m and Map n are equal to each other");
		else
			System.out.println("Map m and Map n are not equal to each other");
		
	  m.putIfAbsent(0, null);
	  m.putIfAbsent(3, "Dashboard Read Only User");
	  m.put(1, "Standard Read Only User");
	  System.out.println("After adding new key-value pairs");
	  System.out.println("Map m: "+m);
	  if(m.equals(n))
			System.out.println("Map m and Map n are equal to each other");
		else
			System.out.println("Map m and Map n are not equal to each other");
	  
	  
		
	
	}

}
