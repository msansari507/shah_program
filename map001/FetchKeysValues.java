// Assignment 104 WAP to fetch both keys & values present in map.
package map001;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FetchKeysValues {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("Alan", "Admin User");
		m.put("Alexa", "Read Only User");
		m.put("Hanna", "Standard User");
		m.put(null, null);
		m.put("Harry", null);
		m.put("Mic", "Dashboard User");
		
		System.out.println("Fetching User Details...");
		for(Entry<String,String> s : m.entrySet())
			System.out.println(s);

	}

}
