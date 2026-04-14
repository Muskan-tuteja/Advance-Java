package BankAcc;

public class withoutsync {
	int balance = 1000;

    void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " Deposited: " + amount + " Balance: " + balance);
    }

    void withdraw(int amount) {
        if (balance >= amount) {
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
	withoutsync acc;

    ATM1(withoutsync acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(800);
    }
}

// Counter Thread
class Counter1 extends Thread {
	withoutsync acc;

    Counter1(withoutsync acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(800);
    }



    public static void main(String[] args) {

    	withoutsync acc = new withoutsync();

        ATM1 atm = new ATM1(acc);
        Counter1 counter = new Counter1(acc);

        atm.setName("ATM");
        counter.setName("Counter");

        atm.start();
        counter.start();
    }

}
