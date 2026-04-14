package Hash;

import java.util.HashSet;

public class Demo5 {
	public static void main(String[] args) {
		HashSet<Character> a= new HashSet<Character>();
		System.out.println(a.isEmpty());
		a.add('A');
		a.add('B');
		a.add('C');
		a.add('D');
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
