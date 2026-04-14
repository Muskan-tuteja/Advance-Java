package pratice;


interface Study{
	void study();
}
interface Sports{
	void play();
}
public class Hybridstudy {
	void show() {
		System.out.println("This is a Person");
	}
	

}
class Student extends Hybridstudy implements Study,Sports{
	public void study() {
		System.out.println("Students is study");
	}
	public void play() {
		System.out.println("Students is playing");
	}
	public static void main(String [] args) {
		Student s = new Student();
		s.show();
		s.play();
		s.study();
	}
}
