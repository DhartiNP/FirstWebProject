package streampractice;

import java.time.LocalDate;

public class DateTimeAPI {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate yesterday = LocalDate.ofYearDay(2023, 2);
		System.out.println(yesterday);
		
		//past dates using minus 
		LocalDate today = LocalDate.now();
		System.out.println(now.minusDays(10));
		
		
	}

}
