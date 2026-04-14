package InterfaceDemo;

import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) {
		Vector a= new Vector();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hii");
		a.add(true);
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		//for loop
		System.out.println(a.get(1));
		for(int i = 0;i < a.size();i++) {
			System.out.println(a.get(i));
		}

		}

}
