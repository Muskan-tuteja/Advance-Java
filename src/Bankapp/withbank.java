package Bankapp;

public class withbank {
	 int balance = 1000;

	    synchronized void deposit(int amount) {
	        balance += amount;
	        System.out.println(Thread.currentThread().getName() +
	                " Deposited: " + amount + " Balance: " + balance);
	    }

	    synchronized void withdraw(int amount) {
	        if (balance >= amount) {
	            System.out.println(Thread.currentThread().getName() + " Processing...");
	            try {
	                Thread.sleep(1000); // simulate delay
	            } catch (InterruptedException e) {}

	            balance -= amount;

	            System.out.println(Thread.currentThread().getName() +
	                    " Withdraw: " + amount + " Balance: " + balance);
	        } else {
	            System.out.println(Thread.currentThread().getName() +
	                    " Insufficient Balance");
	        }
	    }
	}

	// ATM Thread
	class ATM1 extends Thread {
	    BankAccount acc;

	    ATM1(BankAccount acc) {
	        this.acc = acc;
	    }

	    public void run() {
	        acc.withdraw(800);
	    }
	}

	// Counter Thread
	class Counter1 extends Thread {
	    BankAccount acc;

	    Counter1(BankAccount acc) {
	        this.acc = acc;
	    }

	    public void run() {
	        acc.withdraw(800);
	    }
	

	
	    public static void main(String[] args) {

	        BankAccount acc = new BankAccount();

	        ATM1 atm = new ATM1(acc);
	        Counter1 counter = new Counter1(acc);

	        atm.setName("ATM1");
	        counter.setName("Counter1");

	        atm.start();
	        counter.start();
	    }
}
