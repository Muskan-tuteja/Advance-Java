package InterfaceDemo;

import java.util.LinkedHashSet;

public class Demo5 {
	public static void main(String[] args) {
		LinkedHashSet a= new LinkedHashSet();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hii");
		a.add(true);
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());

		}
}
