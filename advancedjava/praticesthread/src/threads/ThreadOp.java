package threads;

public class ThreadOp {
	public static void main(String[] args) {
		
		System.out.println("Program Started..");
		int x= 3+3;
		System.out.println("sum is"+x);
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current running name " + tname);
		System.out.println(t.getName());
		t.setName("myname");
		System.out.println(t.getName());
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			
		}
		System.out.println("program ended..");
	}

}
