package multi;

public class oddeven1 {
	  public static void main(String[] args) {

	        Thread t1 = new Thread(new OddEven(1), "Odd Thread");
	        Thread t2 = new Thread(new OddEven(2), "Even Thread");

	        t1.start();
	        t2.start();
	    }

}
class OddEven implements Runnable {
    private int start;

    public OddEven(int start) {
        this.start = start;
    }
    @Override
    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
