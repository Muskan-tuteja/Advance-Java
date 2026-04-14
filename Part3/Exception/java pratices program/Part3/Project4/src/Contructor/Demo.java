package Contructor;

public class Demo {
	String User;
	Long Password;
	
	public Demo() {
	System.out.println("");
	}
	public Demo(int a) {
		System.out.println(7);
	}
	public Demo(String a , Long b) {
		User = a;
		Password = b;
	}
	public static void main(String[] args) {
		Demo u1 = new Demo();
	}

}
