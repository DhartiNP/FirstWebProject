package startNew;

import java.math.BigDecimal;

public class BiNumberMethod {

	private int num1;// instance variable
	static int num2;// static variable
	BigDecimal bd = new BigDecimal("67.987690");
	BigDecimal bd1 = new BigDecimal("97.98656");
	

	public BiNumberMethod(int num1, int num2) {
		this.num1 = num1; // instance variable
		BiNumberMethod.num2 = num2;// static variable so append class name automatically.
	}

	public int add() {
		// int num11 = 7; // local variable which is created inside the method and
		// initialized before using it
		return num1 + num2;// when use num3 in add method giving a compile error.

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		BiNumberMethod.num2 = num2;
	}

	public int multiply(int num2) {
		int num3 = 4;// taking local variable and declaring inside the method.
		return num3 * num2; // can not pass num3 as parameter but using in return so multiplication is
							// possible
	}

	public void doubleValue(int num1, int num2) {
		 this.num1=2*num1;
		 this.num2=2*num2;
	}
	
	
}
