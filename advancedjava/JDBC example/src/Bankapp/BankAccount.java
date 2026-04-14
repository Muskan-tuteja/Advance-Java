package Bankapp;

public class BankAccount {
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
class ATM extends Thread {
    BankAccount acc;

    ATM(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(800);
    }
}

// Counter Thread
class Counter extends Thread {
    BankAccount acc;

    Counter(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(800);
    }



    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        ATM atm = new ATM(acc);
        Counter counter = new Counter(acc);

        atm.setName("ATM");
        counter.setName("Counter");

        atm.start();
        counter.start();
    }
}
