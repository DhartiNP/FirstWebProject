package collections;

public class Multiple_Threads_Class_one extends Thread{
	
	public void run() {
		System.out.println("Task two form Thread two");
	}

	public static void main(String[] args) {
		Multiple_Threads_Class thread = new Multiple_Threads_Class();
		thread.start();
		
		Multiple_Threads_Class_one thread1 = new Multiple_Threads_Class_one();
		thread1.start();

	}

}
