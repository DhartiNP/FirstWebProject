package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String args[]) {
		List l = new ArrayList();
		l.add("Dharti1");
		l.add("Zebra2");
		l.add("Cat3");
		l.add("Zebra4");
		//l.add(null);
		
		System.err.println(l.reversed());
		
		// using iterator can get all the values one by one
		Iterator iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator listiterator = l.listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}

		while (listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		l.remove(4);
		System.out.println(l);
		
		
		

		// System.out.println(l);
	}

	private static char[] sort(List l) {
		// TODO Auto-generated method stub
		return null;
	}

}
