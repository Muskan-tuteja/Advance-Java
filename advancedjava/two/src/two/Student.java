package two;

public class Student {
	String name;
	int age;
	
	Student(){
		name= "muskan";
		age =90;
	}
	Student(String n){
		name =n;
		age = 45;
	}
	Student (String n , int b){
		name =n;
		age = b;
	}
	void display() {
		System.out.println(name + " " + age);
		
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("mahi");
		Student s3 = new Student("rita",23);
		
		s1.display();
		s2.display();
		s3.display();
		
	}
}
