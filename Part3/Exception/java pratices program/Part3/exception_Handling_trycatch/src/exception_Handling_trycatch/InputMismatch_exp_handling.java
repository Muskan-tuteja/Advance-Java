package exception_Handling_trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch_exp_handling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        try {
        int num = sc.nextInt();   // expects integer
        System.out.println(num);
        }
        catch(InputMismatchException e) {
        	System.out.println(e);
        }

	}


}
