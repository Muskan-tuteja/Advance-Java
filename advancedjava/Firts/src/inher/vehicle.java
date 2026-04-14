package inher;

public class vehicle {
	void start() {
		System.out.println("vehicale start");
	}

}
class car extends vehicle{
	void drive() {
		System.out.println("car is driving");
	}
} 
class bike extends vehicle{
	void ride() {
		System.out.println("bike is ride");
	}
	public static void main(String[] args) {
		car c = new car();
		c.drive();
		c.start();
		bike b = new bike();
		b.ride();
		b.start();
	}
}

