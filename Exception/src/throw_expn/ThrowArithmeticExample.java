package throw_expn;

public class ThrowArithmeticExample {
	 public static void main(String[] args) {

	        try {
	            throw new ArithmeticException("Number should not be zero");
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Handled Exception: " + e.getMessage());
	        }

	        System.out.println("Program continues...");
	    }

}
