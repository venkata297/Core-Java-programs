package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_demo {
	
	public static void MaptoSetConversion() {
		
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(0,"vamsi");
		h1.put(1,"kris");
		h1.put(2,"venkat");
		h1.put(3,"venkat");
		h1.put(4,null);
		
		Set<Entry<Integer,String>> s1 = h1.entrySet();
		System.out.println(s1);
	}
	
	public static void finddupinArray() {
		
		String[] s1= {"vam","kris","null","vam","tang","kris","null"};
		HashSet<String> str = new HashSet<String>();
		
		for(String s2: s1) {
			if(!str.add(s2)) {
				System.out.println("duplicate element is" + " " +s2);
			}
		}
	}
	
	public static void main(String[] args) {
		HashMap_demo.MaptoSetConversion();
		HashMap_demo.finddupinArray();
		
	 	
	}
	
	
}
