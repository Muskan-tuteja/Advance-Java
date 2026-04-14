package TreSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreSet2 {
	public static void main(String[] args) {
		TreeSet<Long> a= new TreeSet<Long>();
		System.out.println(a.isEmpty());
		a.add(7324324356L);
		a.add(7324324356L);
		a.add(73243274594356L);
		a.add(7324328434356L);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
