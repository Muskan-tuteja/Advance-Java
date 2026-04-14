package two;

public class parents {
	public static void test() {
		System.out.println("from parents");
	}
	class chile extends parents{
		public static void test() {
			System.out.println("form child");
		}
		public static void main(String[] args) {
//			parents p1 = new chile();
//			p1.test();
//			chile p2 = new chile();
//			p2.test();
		}
	}

}
