package Encapuslation;

public class Students {
//	Encauplation
	
	private int id;
	private Long password;
	private int account;
	private String name;
	
	public Students() {
		System.out.println("default...");
	}
	public int getId() {
		return this.id;
	}
	public Long getpass() {
		return this.password;
	}
	public int getacc() {
		return this.account;
	}
	public String getname() {
		return this.name;
	}
	
	public void setId(int id) {
		System.out.println("setter used....");
		this.id = id;
	}
	
	public void setname(String name) {
		this.name= name;
	}
	
	public void setacc( int account) {
		this.account = account;
	}
	public Students(String name,int id, Long password, int account) {
		System.out.println("parmeteries....");
		this.name= name;
		this.account=account;
		this.id= id;
		this.password=password;
	}
	
	

}
