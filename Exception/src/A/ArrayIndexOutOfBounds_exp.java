package A;

public class ArrayIndexOutOfBounds_exp {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};

        System.out.println(arr[5]);   // index does not exist
        
        //Why this happens ?Array size = 3 .Valid index = 0, 1, 2 .We tried to access index 5 .So Java throws ArrayIndexOutOfBoundsException

        
        
        
        
	}

}
