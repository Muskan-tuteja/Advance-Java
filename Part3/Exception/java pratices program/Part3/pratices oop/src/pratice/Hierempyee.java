package pratice;

public class Hierempyee {
	void salary() {
		System.out.println("Salary 2000");
	}

}
class developer extends Hierempyee{
	void work() {
		System.out.println("Deveploper codee..");
	}
}
class Manager extends Hierempyee{
	void manager() {
		System.out.println("Manager teams");
	}
	public static void main(String [] args) {
		developer D = new developer();
		D.salary();
		D.work();
		 Manager M = new  Manager();
		 M.salary();
		 M.manager();
		
		
	}
}
