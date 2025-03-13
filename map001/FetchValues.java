// Assignment 103 WAP to fetch all the values present in map.
package map001;

import java.util.HashMap;
import java.util.Map;

public class FetchValues {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("Alan", "Admin User");
		m.put("Alexa", "Read Only User");
		m.put("Hanna", "Standard User");
		m.put(null, null);
		m.put("Harry", null);
		m.put("Mic", "Dashboard User");
		
		System.out.println("Fetching all the User Profiles (values)..");
		for(String s:m.values())
			System.out.println(s);

	}

}
