package pratice;
interface A {
	void show();
}
interface B{
	void display();
}

public class multiple implements A,B {
	
		public void show() {
			System.out.println("show method ");
		}
		public void display() {
			System.out.println("show dispaly");
		}
		public static void main(String [] args) {
			multiple t = new multiple();
			t.show();
			t.display();
		}
	}
	


