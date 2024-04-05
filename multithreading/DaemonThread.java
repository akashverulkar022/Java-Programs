package multithreading;

public class DaemonThread extends Thread {

	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		DaemonThread t3 = new DaemonThread();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		

	}
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Works!");
		}
		else {
			System.out.println("User Thread Works!");
		}
	}

}
