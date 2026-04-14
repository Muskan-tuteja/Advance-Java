package exception_Handling_trycatch;

public class NullPointer_exp_handling {
public static void main(String[] args) {
		
		try {
			  String name = null;   // variable pointing to nothing
			  System.out.println(name.length());   // trying to use null
		}
      catch(NullPointerException nn) {
        System.out.println(nn);   // trying to use null
	}
		System.out.println("---------------");
	}
}
