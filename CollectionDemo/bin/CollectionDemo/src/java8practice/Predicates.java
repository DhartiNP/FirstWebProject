package java8practice;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		//Predicate<Integer> lesserthan = i-> (i<19);
		//System.out.println(lesserthan.test(13));
		
		Predicate<Integer> greaterThan = i-> (i<20);
		Predicate<Integer> lesserthan = i-> (i>10);
		
		boolean result = greaterThan.and(lesserthan).test(15);
		System.out.println(result);
		
		Predicate<String> startsWithLetterD = x->x.toUpperCase().charAt(0)=='D';
		Predicate<String> endsWithLetterI = x->x.charAt(x.length()-1)=='i';
		Predicate<String> and = startsWithLetterD.and (endsWithLetterI);
		System.out.println(and.test("kjhjhkhi"));
		
		Predicate<Integer> evenNumbres = x-> x%2==1;
		System.out.println(evenNumbres.test(10));
		
		//BiPredicate
		
		BiPredicate<Integer,Integer> oddNumber = (x,y) -> x%2==0 && y%2==0;
		System.out.println(oddNumber.test(4, 6)); //true
		System.out.println(oddNumber.test(4, 3)); // false
		
		BiPredicate<String,Integer> biPredicate = (str,x) -> str.length()==x;
		System.out.println(biPredicate.test("Dharti", 6));
	
		
	}

}
