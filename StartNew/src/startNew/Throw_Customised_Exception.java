package startNew;

import java.util.Scanner;

public class Throw_Customised_Exception extends RuntimeException {

	/*
	 * Throw_Customised_Exception(String msg) { super(msg); }
	 */
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age : ");

		int age = scanner.nextInt();
		try {
		if (age < 18) {
			throw new ArithmeticException("You are not eligible for voting");
		} else {
			System.out.println("Able for voting");
		}
		} catch(Throw_Customised_Exception e) {
			e.printStackTrace();
		}
		System.out.println("complete the program");
	}
}
