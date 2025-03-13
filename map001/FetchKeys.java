//Assignment 102 WAP to fetch all the keys present in map
package map001;

import java.util.HashMap;
import java.util.Map;

public class FetchKeys {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("Alan", "Admin User");
		m.put("Alexa", "Read Only User");
		m.put("Hanna", "Standard User");
		m.put(null, null);
		m.put("Harry", null);
		m.put("Mic", "Dashboard User");
		System.out.println("Fetching user names(Keys)...");
		for(String s:m.keySet()) { // for each loop
//			if(s!=null)
			System.out.println(s);
		}

	}

}
