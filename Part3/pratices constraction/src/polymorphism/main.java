package polymorphism;

public class main {
	public static void main(String[] args) {
		calucal c1 = new calucal();
		System.out.println(c1.add("muskan", 2));
		System.out.println(c1.add(3, 6));
//		c1.add(2, 2, 4);//not output
		System.out.println(c1.add(2, 4, 7));
		
	}

}
