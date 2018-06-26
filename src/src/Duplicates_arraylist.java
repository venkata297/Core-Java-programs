package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates_arraylist {
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		str.add("john");
		str.add("Bill");
		str.add("Michael");
		str.add("Bill");
		
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		
		for (String s : str) {
		    if (hs.containsKey(s)) {
		        hs.put(s, hs.get(s) + 1);
		    } else {
		        hs.put(s, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : hs.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
	}
	}

}
