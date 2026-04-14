 package pratice;

public class parents {
	void eat() {
		System.out.println("Solution");
	}

}
class child extends parents{
	void eats() {
		System.out.println("Solutions....");
	}
}
class subChild extends child{
	void eatss() {
		System.out.println("solution..2..");
	}
	public static void main(String [] args) {
		subChild s = new subChild();
		s.eat();
		s.eats();
		s.eatss();
	}
}
