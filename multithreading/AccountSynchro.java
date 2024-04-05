package multithreading;

public class AccountSynchro implements Runnable {
	
	private Account acct = new Account();

	public static void main(String[] args) {
		AccountSynchro accDanger = new AccountSynchro();
		Thread t1 = new Thread(accDanger);
		Thread t2 = new Thread(accDanger);
		t1.setName("Suraj");
		t2.setName("Vijay");
		t1.start();
		t2.start();

	}
	@Override
	public void run() {
		for (int i = 1; i<=5; i++) {
			makeWithdrawal(1000);
		}
		
	}
	public synchronized void makeWithdrawal(int amount) {
		if(acct.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" complete withdraw.  Balance :"+acct.getBalance());
		}
		else {
			System.out.println("Not enough balance in account for "+Thread.currentThread().getName()+" Balance :"+acct.getBalance());
		}
	}

}
