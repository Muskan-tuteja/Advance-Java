package InterfaceDemo;

import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList a= new LinkedList();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hii");
		a.add(true);
		a.add(null);
		a.add(3.4);
		System.out.println(a);
		System.out.println(a.isEmpty());
		
//		for(Object x:a)
//		{
//			System.out.println(x);
//		}
		
		int i =0;
		do {
			System.out.println(a.get(3));
//			System.out.println(a.get(i));
			i++;
		}
		while(i<a.size());

		}
}
