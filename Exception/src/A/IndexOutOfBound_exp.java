package A;
import java.util.ArrayList;

public class IndexOutOfBound_exp {
	public static void main(String[] args) {
		   ArrayList<Integer> list = new ArrayList<>();

     list.add(10);
     list.add(20);

     System.out.println(list.get(5));   // index does not exist
 

     
     
//     Why this happens ?  The list has only 2 elements (index 0 and 1). We tried to access index 5 . So Java throws IndexOutOfBoundsException .  IndexOutOfBoundsException occurs when we access an index that is outside the valid range.
     
     
     
     
	}


}
