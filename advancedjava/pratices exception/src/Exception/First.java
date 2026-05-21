package Exception;

public class First {
	public static void main(String[] args) {
//		int a = 10;
//		int result = 10/0;
//		System.out.println("Done");
		int[] a = {1,2,3};
	try {
		//Exception generating statements
//		int result = 10/0;
		System.out.println(a[6]);
		
		
	}catch(Exception e) {
		
		//Exception handlling statements
		
		System.out.println("In catch block");
	}
int [] c = {2,4,5};
try {
	System.out.println(c[9]);
}catch(IndexOutOfBoundsException e) {
	System.out.println("EXCEPTION");
}catch(ArithmeticException e) {
	System.out.println("Artimentic exception");
}finally {
	//Always exceutes
	System.out.println("Finally block");
}
	
	}

}
