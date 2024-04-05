package multithreading;

class Customer{
	private int balance = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw Rs."+amount);
		if (balance<amount) {
			System.out.println("less Balance. Waiting for Deposite...");
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw completed. Balance : Rs."+balance);
		notify();
	}
	synchronized void deposit(int amount) {
	System.out.println("Going to deposite Rs."+amount);
	balance += amount;
	System.out.println("deposite completes. Balance : Rs."+balance);
	notify();
	}
}

public class InterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		new Thread("Tom") {
			public void run() {customer.withdraw(15000);};
		}.start();
		new Thread("Jerry") {
			public void run() {customer.deposit(20000);};
		}.start();

	}

}
