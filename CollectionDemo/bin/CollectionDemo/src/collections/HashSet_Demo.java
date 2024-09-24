package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		A a1 = new C();

        a1.print();

        //a1.print_C();
 
        A a2 = (C) new B();

        a2.print();
 
      //  B b1 =  new A();

       // b1.print();

        B b2 = (B) new A();

        b2.print();

				try {
					 System.out.println("entered in try test2");
				        //int a = 10/0;
				        System.out.println("before try return test2");
				        return;
				}
				catch (ArithmeticException e) {
					 System.out.println("In catch test2");
				        //throw e;
				}
				finally {
		        	System.out.println(
						"finally");
		        
				}
				 System.out.println("End of method test2");
				
			
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		//Create hashset with hashset(object) constructor
		HashSet hs = new HashSet(al);
		hs.add("Ab");
		hs.add("Bb");
		hs.add("Cb");
		hs.add("Db");
		
		System.out.println(hs);
		
		HashSet hs1 = new HashSet();
		hs1.add("Ab1");
		hs1.add("Bb1");
		
		System.out.println(hs1);
		
		Object hs2 = hs.clone();
		System.out.println(hs2);
		
		System.out.println(hs.contains("Cb"));
		
		Iterator iterator = hs.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
