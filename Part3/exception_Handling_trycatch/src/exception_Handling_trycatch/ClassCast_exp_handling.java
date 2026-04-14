package exception_Handling_trycatch;

public class ClassCast_exp_handling {

	// is a exptn that occur during runtime while downcasting .
	
	public static void main(String[] args) {
		
		Object b = 10;
		try {
		Float f= (Float) b;
		System.out.println(f);	
		}
		catch(ClassCastException cce) {
			System.out.println(cce);	
		}
	

	}

}
