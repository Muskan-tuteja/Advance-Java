package contraction;

public class Student {
	public int id;
	public String name;
	public int age;
	public String City;
	
	public Student() {
		System.out.println("Default Contrator...");
	}
	public Student(int id, String name,int age,String City) {
		System.out.println("student parmeterid");
//		this.age=age;
//		this.City=City;
		this.id=id;
		this.name=name;
		
	}
	public Student (int id , String name) {
		System.out.println("Contractior oveloading...");
		this.id=id;
		this.name=name;
	}
	public Student (int id) {
		System.out.println("Again Contractior oveloading...");
		this.id=id;
	}
	public static void main(String[] args) {
		Student A = new Student(1,"muskan",23,"hisar");
	System.out.println(A.id);
	System.out.println(A.age);
	System.out.println(A.name);
	System.out.println(A.City);
	
	Student B = new Student(2,"mahi");
System.out.println(B.id);
System.out.println(B.name);

Student C = new Student(234);
System.out.println(C.id);
	
		
		
	}

}
