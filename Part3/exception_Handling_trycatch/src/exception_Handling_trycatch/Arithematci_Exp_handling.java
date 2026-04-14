package exception_Handling_trycatch;

public class Arithematci_Exp_handling {
public static void main(String[] args) {
		
		System.out.println("start");
		int a = 10;
		int b = 0;
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println(a+b);

		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException y)
		{
			y.printStackTrace();					//will print the StackTrace/Detail of exp=FQN+R+Loc   
		}
		
		System.out.println("hy");
		System.out.println("hello");
		System.out.println("bye");



	}

}
