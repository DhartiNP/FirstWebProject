package startNew;

import java.math.BigDecimal;
import java.math.MathContext;

public class Classes {

	static int k = 3;
	static int a = k++;
	static int j = 7;
	static int b = ++j;
	
	public static void main(String args[]) {
		System.out.println(a);
		System.out.println(k);
		System.out.println(j);
		System.out.println(b);
		
		float f = 25.5664f;
		float f1 = 25.3448f;
		
		float floatAddition = f+f1;
		System.out.println(floatAddition);
		
		
		BigDecimal bd = new BigDecimal("90");
		BigDecimal bd1 = new BigDecimal("78");
		
			System.out.println(bd1.pow(2));
			System.out.println(bd.max(bd1));
			System.out.println(bd.compareTo(bd1));
		 bd = bd.add(bd1);
		 System.out.println(bd);
	}
}
