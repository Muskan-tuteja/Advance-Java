package multi;

public class Currentname {
	public static void main(String[] args) {

        MwThread t1 = new MwThread("First Thread");
        MwThread t2 = new MwThread("Second Thread");

        t1.start();
        t2.start();
    }

}
class MwThread extends Thread {

    public MwThread(String name) {
        super(name); 
    }

    @Override
    public void run() {
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
    }
}

