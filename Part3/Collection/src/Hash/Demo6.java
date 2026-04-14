package Hash;

import java.util.HashSet;

public class Demo6 {
	public static void main(String[] args) {
		HashSet<Long> a= new HashSet<Long>();
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
