package exception_Handling_trycatch;

public class ArrayIndexOutOfBounds_exp_handling {
	public static void main(String[] args) {
		int[] arr = {600, 280, 8 , 60};

		try{
        System.out.println(arr[5]);   // index does not exist
        System.out.println(arr);
		}
		catch(ArrayIndexOutOfBoundsException aa ) {
			aa.printStackTrace();
		}
		 System.out.println(arr);
		 System.out.println("========");
	}

}
