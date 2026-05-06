package Encapuslation;

public class privates {
	public static void main(String[] args) {
		Students A = new Students("Muskan",23,34456778L,3455);
		System.out.println(A.getname());
		System.out.println(A.getacc());
		System.out.println(A.getId());
		System.out.println(A.getpass());
	A.setId(1243);
	A.setname("ishuu");
	A.setacc(2349087);
	System.out.println(A.getId());
	System.out.println(A.getname());
	System.out.println(A.getacc());
	}

}
