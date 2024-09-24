package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
public class Learn_Collection {

	public static void main (String args[]) {
		ArrayList al = new ArrayList<>();
		al.add ("Dhartri");
		al.add(100);
		al.add(true);
		al.size();		
		System.out.println(al);
		//displayed boolean as a result
		System.out.println(al.add("800"));
		System.out.println(al.size());
		
		LinkedList ll = new LinkedList();
		ll.add("Diva");
		ll.add(200);
		ll.add("Divam");
		
		al.addAll(ll);
		
		System.out.println(al);
		
	}
}
