package A;
import java.util.Scanner;

public class Arithematic_exp {
	private static void m2() {
		Scanner s = new Scanner(System.in);
		System.out.println("wc");
		System.out.println("enter the 1st num");
		int p = s.nextInt();
		System.out.println("enter the 2nd number");
		int q = s.nextInt();
		
		System.out.println(p+q);
		System.out.println(p-q);//1,0 dalo arthematic exctn ayga dkvision k baad koi execute nhi hogaa.
		System.out.println(p*q);
		System.out.println(p/q);
		System.out.println("done");
		System.out.println("tq");		
	}
	
	public static void main(String[] args) {
		m2();

	}

}
