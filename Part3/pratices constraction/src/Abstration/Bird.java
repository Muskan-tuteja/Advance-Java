package Abstration;

abstract class Bird {
	abstract void fly();
	
	abstract void eat();

}
class sparrow extends Bird{
	@Override
	void fly() {
		System.out.println("Sparrow fly...");
	}
	
	@Override
	void eat() {
		System.out.println("Sparrow eat...");
	}
	
}

