package collections;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		Stack stk = new Stack();
		
		
		stk.push("Str1");
		stk.push("Str2");
		stk.push("Str3");
		stk.add(3, "Str5");
		stk.add(3,"Str4");
		System.out.println(stk);
		//removing last and displayed last element
		System.out.println(stk.pop());
		System.out.println(stk);
		//displayed last element without removing element.
		System.out.println(stk.peek());
		System.out.println(stk);
		System.out.println(stk.getFirst());
		System.out.println(stk.capacity());//vector's method
		System.out.println(stk.isEmpty());
		
		
		

	}

}
