
package com.qsp;

public class First {
	private  int id = 1001;
	private  String name = "muskan";
	
	public int getid() {
		System.out.println(id);
		return id;
	}
	public String getname() {
		System.out.println(name);
		return name;
	}
	public  void setid(int id) {
		this.id=id;
	}
	public   void setname(String name) {
		this.name=name;

	}
	
	public static void main(String[] args) {
		
	First e1 = new First();
	e1.getname();
	e1.getid();
	e1.setname("isha");
	e1.setid(2001);
	
	System.out.println(e1.getname());
	

	}

}
