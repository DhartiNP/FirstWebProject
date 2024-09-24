package collections;

import java.util.LinkedList;
import java.util.List;

public abstract class LinkedListDemo implements List{

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList<>();
		linkedList.add(0, "ABC");
		linkedList.add("A2");
		linkedList.add("A3");
		linkedList.add("A5");
		
		System.out.println(linkedList);
		
		linkedList.set(0, "A1");
		linkedList.add(3, "A4");
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.getFirst());
		
		System.out.println(linkedList);
		
		Object[] a = linkedList.toArray();
		System.out.println(a);
		for(Object element : a)
	        System.out.print(element+" ");
	}

}
