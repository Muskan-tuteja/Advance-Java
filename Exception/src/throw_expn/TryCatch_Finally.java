package throw_expn;

public class TryCatch_Finally {
	public static void main(String[] args) {
		 try {
	            System.out.println("Inside try block");
	            int a = 10 / 0;   
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e);
	        }
	        finally {
	            System.out.println("Finally block always runs");
	        }

	        System.out.println("Program continues...");

	}

}
