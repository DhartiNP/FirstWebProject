package startNew;

public class BiNumber {

	public static void main(String[] args) {
		BiNumberMethod numbers = new BiNumberMethod(2,4);
		System.out.println(numbers.add());
		
		System.out.println(numbers.multiply(3));
		
		numbers.doubleValue(4, 9);
		
		
		System.out.println(numbers.getNum1());
		System.out.println(numbers.getNum2());
		
		

	}

}
