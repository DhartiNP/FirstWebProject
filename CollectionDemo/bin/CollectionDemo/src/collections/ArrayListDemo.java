package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ArrayListDemo implements List<Object>{

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(90);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		/*
		 * arrayList.add("Divam"); arrayList.add(1,"Diva"); arrayList.set(2,"Divam");
		 */
		
		//for loop with .get() method
		for(int i=0 ; i<arrayList.size();i++) {
			System.out.println(arrayList.get(i) + " ");
		}
		
		System.out.println(arrayList.getFirst());
		System.out.println(arrayList.getLast());
		
	
		//arrayList.remove("Divam");
		
		
		
		System.out.println(arrayList);
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		
		 ArrayList<Integer> al = new ArrayList<Integer>(); al.add(0, 10);
		 al.add(1,40); al.add(2,80);
		 
		 System.out.println(arrayList.get(2));
		
		  al.removeAll(arrayList);
		  
		  System.out.println(al);
		 
		
	}

}
