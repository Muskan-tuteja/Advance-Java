package inheritance;

public class Developer extends Employee {
	public String dev_frontend;
	public String dev_backend;
	public String dev_name;
	
	Developer(int id, String name,String work, int salary,String dev_frontend,String dev_backend,String dev_name){
		super(id,name,work,salary);
		this.dev_frontend= dev_frontend;
		this.dev_backend = dev_backend;
		this.dev_name = dev_name;
		
	}
	public void DeveloperWork() {
		System.out.println("work the developer : " + dev_frontend);
	}

}
