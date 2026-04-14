package BankAcc;
import java.util.Scanner;

public class Bank {


	    int balance = 1000;

	    public synchronized void start() {

	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- State Bank Of India ---");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Exit");
	            System.out.println("Enter choice:");

	            choice = sc.nextInt();

	            if (choice == 1) {
	                System.out.println("Balance: " + balance);
	            }

	            else if (choice == 2) {
	                System.out.println("Enter amount to withdraw:");
	                int amount = sc.nextInt();

	                if (balance >= amount) {
	                    balance = balance - amount;
	                    System.out.println("Withdraw: " + amount);
	                } else {
	                    System.out.println("Not enough money");
	                }
	            }

	            else if (choice == 3) {
	                System.out.println("Enter amount to deposit:");
	                int amount = sc.nextInt();

	                balance = balance + amount;
	                System.out.println("Deposited: " + amount);
	                System.out.println(balance);
	                System.out.println("Balance: " + balance);
	            }
	            else
	            {
	            	 System.out.println("INvalid data ");
	            }

	        } while (choice != 4);

	        System.out.println("Program Ended");
	    }

	    public static void main(String[] args) {
	        Bank b = new Bank();
	        b.start();
	    }
	}


