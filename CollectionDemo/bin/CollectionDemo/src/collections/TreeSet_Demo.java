package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet();
		
		treeSet.add(40);
		treeSet.add(50);
		treeSet.add(30);
		//treeSet.add("Dharti");
		
		
		TreeSet<StringBuffer> tssf= new TreeSet<>();
		
		
		
		
		tssf.add(new StringBuffer("Dharti"));
		tssf.add(new StringBuffer(10));
		tssf.add(new StringBuffer("Abc"));
		
		System.out.println(tssf);
		
		

	}

}
