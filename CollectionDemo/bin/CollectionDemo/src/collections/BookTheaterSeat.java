package collections;

public class BookTheaterSeat {

	//public static BookTheaterSeat b;
	static int totalSeat = 20;

	static synchronized void bookSheet(int seats) {
		 
		//This is used for the synchronises block
		/*
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println(Thread.currentThread().getName());
		 */
		/*synchronized (this) {*/
			if (totalSeat >= seats) {
				System.out.println(seats + " Seats booked successfully");
				totalSeat = totalSeat - seats;
				System.out.println("Left Seats : " + totalSeat);
			} else {
				System.out.println("seats can not be booked");
				System.out.println("Left Seats : " + totalSeat);
			}
		//}
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
	}
}
	

