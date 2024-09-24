package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main (String args[]) {
		Set s = new HashSet();
		s.add("Dharti");
		s.add("D2");
		s.add("D11");
		s.add("ooops");
		s.add("ooops");
		s.add(null);
		s.add(null);
		
		
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(s);
		
	
		
	}
}
