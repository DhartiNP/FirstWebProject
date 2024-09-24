package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1,"AA");
		hm.put(22, "BB");
		hm.put(39, "BB");
		hm.put(4, "FF");
		
		Map<String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("Sachin", 1200);
		hashmap.put("Dravid", null);
		hashmap.put("abc",null);
		hashmap.put("Sachin",1300);
		hashmap.put("kiyana", null);
		//hashmap.put(null, null);
		
		System.out.println(hashmap);
			
		
		//If you try to add obj in hs Set then not able to add displayed runtime exception.
		Set<?> hs = hm.entrySet();
		//hs.add(34);
		//System.out.println(hs);
		hm.replace(2, "B2");
		System.out.println(hm.get(1));
		System.out.println(hm.containsValue("AA"));
		System.out.println(hm);
	
		
	//System.out.println(((HashMap) hm).clone());
		
		System.out.println(hm.keySet());
		
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm);
		
		System.out.println(hm2);
		
		 for (Map.Entry e : hm.entrySet())
	            System.out.println("Key: " + e.getKey()
	                               + " Value: " + e.getValue());
		 
		 Iterator<?> iterator = hs.iterator();
		  while (iterator.hasNext()) {
			  Map.Entry entry = (Map.Entry) iterator.next();
			  System.out.println("Key: " + entry.getKey()
              + " Value: " + entry.getValue());
		  }

		  TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		  tm.put(9,null);
		  tm.put(3, "Dharti");
		  tm.put(4,"Divam");
		  tm.put(7, "Diva");
		  //tm.put(null, null);
			/*
			 * System.out.println(tm); System.out.println(tm.ceilingKey(8));
			 * System.out.println(tm.ceilingEntry(8));
			 */
		  
		  //The hashmap might not have the entries in the sorted order
			// So, we'll create a treemap using the previously created hashmap
			// We'll pass the hashmap as an argument to the treemap
		  System.out.println("hashmap" + hashmap);
		  TreeMap<String,Integer> tmap = new TreeMap<>(hashmap);
		  System.out.println(tmap);
			
		  
	}
		

}
