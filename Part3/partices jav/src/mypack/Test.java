package mypack;

public class Test {
	public static void main(String[]args) {
		try {
			int a = 20;
			int b =0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
			
		}
		System.out.println("Program contibues...");
		}

}
