package overriding;

public class main {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Shape c2 = new Circle();//upcating 
		Circle c3 = (Circle) c2;//downcasting
		
		c3.m1();
		c2.m1();
		c1.m1();
	}

}
