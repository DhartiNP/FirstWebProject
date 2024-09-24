package collections;

public class Daemon_Thread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon Thread");
		} else {
			System.out.println("Child Thread");
		}
		
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Main Thread");

		Daemon_Thread daemon = new Daemon_Thread();
		//daemon.setDaemon(true);
		daemon.start();
		daemon.setPriority(2);

	}

}
