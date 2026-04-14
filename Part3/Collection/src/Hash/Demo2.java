package Hash;

import java.util.HashSet;

public class Demo2 {
	public static void main(String[] args) {
		HashSet<Integer> a= new HashSet<Integer>();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add(8);
		a.add(0);
		a.add(8);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
