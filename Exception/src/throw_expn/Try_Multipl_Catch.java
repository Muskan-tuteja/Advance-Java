package throw_expn;

public class Try_Multipl_Catch {
	public class TryMultipleCatchExample {

	    public static void main(String[] args) {

	        try {
	            int a = 10;
	            int b = 0;

	            int result = a / b;  // ArithmeticException
	            System.out.println(result);

	            String str = null;
	            System.out.println(str.length()); // NullPointerException

	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero");
	        } 
	        catch (NullPointerException e) {
	            System.out.println("String is null");
	        } 
	        catch (Exception e) {
	            System.out.println("Other exception occurred");
	        }

	        System.out.println("Program ended");
	    }
	}

}

