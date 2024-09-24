package startNew;

import java.util.Iterator;

public class Learning {

	public static void main(String[] args) {
		float a1 = 6.5f;
		int i = 1;
		int a = 23;
		int b = 10;
		int c = 8;
		int d = 40;
		
		int k = 10;
		k++;
		
		System.out.println("Hello World");
		System.out.println("5*3");
		System.out.println(5 * 3);
		System.out.println("5*1=5");
		System.out.println("5*2=10");
		System.out.println("5*3=15");
		System.out.println("5*4=20");
		System.out.println("No of seconds in a day = " + 24 * 60 * 60);
		System.out.printf("5*4=20").println();
		System.out.printf("5*5=%d", 5 * 5).println();
		System.out.printf("%d*%d=%d", 5, 6, 30).println();// %d=5,%d=6,%d=35
		System.out.printf("%f\n", a1);// no need of println as a is already declared.
		System.out.printf("%d+%d+%d=%d", 5, 6, 7, 5 + 6 + 7).println();
		// System.out.printf("%d*%d=%d", 5, i, 5).println();
		// i = 5; // change the value of i and assigned as 5
		// System.out.printf("%d*%d=%d", 5, i, 5).println();
		System.out.printf("%d+%d+%d=%d", a, b, c, a + b + c).println();
		a = 20;
		System.out.printf("%d+%d+%d=%d", a, b, c, a + b + c).println();
		b = 35;
		System.out.printf("%d+%d+%d=%d", a, b, c, a + b + c).println();

		if (a + b > c + d) {
			System.out.println("a+b is greater than c+d : " + (a + b) + "," + (c + d));
		}

		int angle1 = 60;
		int angle2 = 60;
		int angle3 = 90;

		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("create an triangle");
		} else {
			System.out.println("Not create an triangle");
		}

		int number = 38;

		if (number % 2 == 0) {
			System.out.println("number is even " + number);
		} else {
			System.out.println("number is odd " + number);
		}
		// print 5 table
		for (i = 1; i <= 10; i++) {
			System.out.printf("%d*%d=%d", 5, i, 5 * i).println();
		}

		// print 6 table
		for (i = 1; i <= 10; i++) {
			System.out.printf("%d*%d=%d", 6, i, 6 * i).println();
		}

		// print 10 table
		for (i = 1; i <= 10; i++) {
			System.out.printf("%d*%d=%d", 10, i, 10 * i).println();
		}

		// print numbers from 1 to 10
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// print number from 10 t0 1
		for (i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// print square of first 10 numbers
		for (i = 1; i <= 10; i++) {
			System.out.println(i * i);
		}

		// print square of fist 10 even numbers
		//
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i * i);
			}

		}
		// print square of fist 10 odd numbers
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i * i);
			}

		}
		// for loop will be execute with out any condition like below but it will
		// go in to the infinite loop.
		/*
		 * for(; ;) { System.out.println("Shree"); }
		 */
		// Nested if

		// a=20,b=35,c=8
		if (a > b && a > c) {
			System.out.println(a);
		} else {
			if (c > b) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		}

		// nested if
		if (b == 35 || b > 32) {
			System.out.println("b is greater than 32");
			if (b > 26) {
				System.out.println("b is greater than 26");

			}
		}

		// switch-case
		int num = 80;
		switch (num) {
		case 150:
			System.out.println("num is greater than 150");
			break;
		case 60:
			System.out.println("num is greater than 10");
			break;
		default:
			System.out.println("No case is matched so default is executed");

		}
		
		for(int u=0; u<=10;u++) {
			System.out.println(u);
		}

	}

}
