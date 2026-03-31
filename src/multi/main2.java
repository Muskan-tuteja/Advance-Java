package multi;

public class main2 {
	public static void main(String[] args) {
        Thread a1 = new Thread(new Thread4());
        a1.start();
    }
}

class Thread4 implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }

}
