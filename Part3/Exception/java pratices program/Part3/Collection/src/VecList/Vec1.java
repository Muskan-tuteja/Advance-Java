package VecList;


import java.util.Vector;

public class Vec1 {
	public static void main(String[] args) {
		Vector<Integer> a= new Vector<Integer>();
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
