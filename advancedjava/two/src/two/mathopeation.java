package two;

public class mathopeation {
	int add(int a, int b) {
		return a+b;
	}
	int add (int a,int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		mathopeation p1 = new mathopeation();
		System.out.println(p1.add(2, 4));
		System.out.println(p1.add(2, 03,5));
	}

}

