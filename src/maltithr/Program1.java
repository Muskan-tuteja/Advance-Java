package maltithr;

public class Program1 {
	public static void main(String[] args) {
		Thread t=new Thread(new Thread5());
		t.start();
	}
	}

	class Thread5 implements Runnable
	{
		@Override
		public void run()
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i);
			}
		}


}
