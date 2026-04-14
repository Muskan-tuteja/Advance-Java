package exception_Handling_trycatch;

public class NumberFormat_Exp_handling {
	public static void main(String[] args) {
		 String a = "qwertyui";
		 
		 
		 try {
		 int num = Integer.parseInt(a);
		 }
		 catch(NumberFormatException n) {
		 System.out.println(n);
		 }
		 
		 

	}
}
