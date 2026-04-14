package TreSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreSet4 {
	public static void main(String[] args) {
		TreeSet<Double> a= new TreeSet<Double>();
		System.out.println(a.isEmpty());
		a.add(2.78);
		a.add(3.7789);
		a.add(2.728);
		a.add(1.728);
		a.add(2.7358);
	
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
