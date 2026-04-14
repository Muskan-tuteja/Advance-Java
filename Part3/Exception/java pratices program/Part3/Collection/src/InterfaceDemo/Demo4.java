package InterfaceDemo;

import java.util.HashSet;

public class Demo4 {
	public static void main(String[] args) {
		HashSet a= new HashSet();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hii");
		a.add(true);
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		

		}
}
