package startNew;

import java.math.BigDecimal;

public class SimpleIntrestCalculatorRunner {

	public static void main(String[] args) {
		SimpleIntrestCalculator calculator = 
				new SimpleIntrestCalculator("4500.00","7.5");
		
		BigDecimal totalValue = calculator.calculatrTotalValue(5);
		
		System.out.println(totalValue);
	}

}
