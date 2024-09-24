package collections;

public class Intrrupt_Method extends Thread{
	public void run() {
		//System.out.println(Thread.interrupted() + "Interrupted");
		System.out.println(Thread.currentThread().isInterrupted());
		try {
		for (int i=0;i<=5;i++) {
			System.out.println("Thread 0 : " + i);
			Thread.sleep(1000);
		}
		} catch (Exception e) {
			System.out.println("Thread intrrupted : " + e);
		}
		
	}
	public static void main(String[] args) {

		Intrrupt_Method mainthread = new Intrrupt_Method();
		mainthread.start();
		//mainthread.interrupt();

	}

}
