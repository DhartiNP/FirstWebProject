package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Comparator {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(20);
	list.add(80);
	list.add(21);
	list.add(45);
	
	//	Collections.sort(list) : [20, 21, 45, 80]
	
	Collections.sort(list,(a,b)-> b-a);
	System.out.println(list);
	
	
}
}
