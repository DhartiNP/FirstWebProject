package startNew;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Cube is " + (number * number * number));
			System.out.println("Enter a number : ");
			number = scanner.nextInt();
		} while (number >= 0);
		System.out.println("Have a fun! ");

		StringBuffer str1 = new StringBuffer("My name is dharti patel");
		System.out.println(str1.deleteCharAt(11));
		System.out.println(str1.replace(12, 17, "Divam"));
		System.out.println(str1.delete(3, 5));
		
		String str = new String("Hello");
		//LocalDAte
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.atTime(5, 4));
		System.out.println(date.atTime(2, 12, 32));
		System.out.println(date.getEra());
		LocalDate yesterday = LocalDate.of(2024, 8, 19);
		System.out.println(yesterday);
		System.out.println(yesterday.withDayOfMonth(5));
		
		//LocalDateTime
		LocalDateTime date1= LocalDateTime.now();
		System.out.println(date1);
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getHour());
		
	}
}
