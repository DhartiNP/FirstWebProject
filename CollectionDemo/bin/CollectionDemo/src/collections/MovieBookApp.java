package collections;

class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSheet(seats);
	}

	public MovieBookApp(BookTheaterSeat b, int seats) {
		super();
		this.b = b;
		this.seats = seats;
	}

	public static void main(String[] args) {

		BookTheaterSeat b1 = new BookTheaterSeat();

		MovieBookApp Thread1 = new MovieBookApp(b1, 7);
		Thread1.start();

		MovieBookApp Thread2 = new MovieBookApp(b1, 6);
		Thread2.start();
		
		BookTheaterSeat b2 = new BookTheaterSeat();

		MovieBookApp1 Thread3 = new MovieBookApp1(b2, 5);
		Thread3.start();

		MovieBookApp1 Thread4 = new MovieBookApp1(b2, 9);
		Thread4.start();


	}

}

