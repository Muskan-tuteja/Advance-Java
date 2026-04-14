package two;

public class sudents {
	String name = "Mahi";
	int age =98;
	void display() {
		String name = "mUSKAN";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.age);
				
	}
	public static void main(String[] args) {
		sudents s = new sudents();
		s.display();
	}

}
