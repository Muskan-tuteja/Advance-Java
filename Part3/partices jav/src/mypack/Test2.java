package mypack;

public class Test2 {
	public static void main(String [] args) {
		try {
			int a=2;
			int b =0;
//			int c = a/b;
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
