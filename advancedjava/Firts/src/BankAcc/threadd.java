package BankAcc;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class threadd {
    public static void main(String[] args) {

        MyThread t1 = new MyThread(); // create thread
        t1.start(); // start thread
        
        

        System.out.println("Main method");
    }
}