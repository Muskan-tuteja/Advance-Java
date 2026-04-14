package InterfaceDemo;


import java.util.TreeSet;

public class Demo6 {
	public static void main(String[] args) {
		TreeSet a= new TreeSet ();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hii");
		a.add(true);
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());

		}
}
