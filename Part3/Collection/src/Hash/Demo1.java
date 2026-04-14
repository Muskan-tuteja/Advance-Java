package Hash;


import java.util.HashSet;

public class Demo1 {
	public static void main(String[] args) {
		HashSet<Boolean> a= new HashSet<>();
		System.out.println(a.isEmpty());
		a.add(true);
		a.add(false);
		a.add(null);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}
}
