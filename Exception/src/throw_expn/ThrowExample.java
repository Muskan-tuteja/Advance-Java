package throw_expn;

public class ThrowExample {

    public static void main(String[] args) {

        // ArithmeticException
        try {
            throw new ArithmeticException("Cannot divide by zero");
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // NullPointerException
        try {
            throw new NullPointerException("String is null");
        } 
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}
