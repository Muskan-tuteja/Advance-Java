package mypack;

public class demo1 {
	 int show(int a) {
		 return a;

	}
	String show(String b) {
		return b;
		
	}
	String show(String f , int e) {
		return e + " " + f;
//Jab String + int hota hai → Java automatic int ko String me convert kar deta hai
				
	}
	public static void main(String[] args) {
		demo1 obj = new demo1();
		System.out.println(obj.show(2));
System.out.println(obj.show("muskan"));
System.out.println(obj.show("mahi", 1234));
		
	}

}
