package collections;

class MovieBookApp1 extends Thread {
	BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSheet(seats);
	}

	public MovieBookApp1(BookTheaterSeat b, int seats) {
		super();
		this.b = b;
		this.seats = seats;
	}
}