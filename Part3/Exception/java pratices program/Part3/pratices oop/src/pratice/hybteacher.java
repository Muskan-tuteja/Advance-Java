package pratice;

interface Teacher{
	void teach();
}

public class hybteacher {
	void name() {
		System.out.println("teacher is teacher");
	}

}
class Students extends hybteacher implements Teacher {
	public void teach() {
		System.out.println("hello teachet");
	}
	public static void main(String [] args) {
		Students w = new Students();
		w.teach();
	}
}
