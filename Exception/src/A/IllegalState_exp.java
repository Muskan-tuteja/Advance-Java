package A;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class IllegalState_exp {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        sc.close();        // Scanner is closed

        sc.nextInt();      // trying to use closed Scanner
		
		
		

	}

}


