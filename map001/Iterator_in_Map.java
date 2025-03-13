// Assignment 105 WAP to iterate a Map using Iterator.
package map001;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Iterator_in_Map {

	public static void main(String[] args) {
		Map<Integer, String> p = new HashMap<Integer, String>();
		System.out.println("-----Page id and Page Name-----");
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=3;i++) { // Taking i/p at run time.
			System.out.println("Enter the Id and Name of Page"+i);
			p.put(s.nextInt(), s.next());
		}
		s.close();
		System.out.println(p);
		
		System.out.println("Now Iteration using Iterator..");
		Set<Entry<Integer,String>> q = p.entrySet();
		Iterator<Entry<Integer,String>> r = q.iterator();
		
		while(r.hasNext()) {
			System.out.println(r.next());
		}

	}

}
