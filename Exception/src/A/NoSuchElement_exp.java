package A;
import java.util.Scanner;

public class NoSuchElement_exp {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        sc.close();          // close scanner

        sc.nextInt();        // trying to read input after closing
   
       
        
//or   
//Scanner sc = new Scanner("");
//sc.next();   // trying to read when no element exists
   

//or
//ArrayList<Integer> list = new ArrayList<>();
//System.out.println(list.get(1));   // accessing element that does not exist
    


}



}


