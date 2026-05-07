package inheritance;

public class Manager extends Employee {
	public int emp_id;
	public String emp_name;
	public String emp_location;
	
	Manager( int id, String name,String work, int salary,int emp_id,String emp_name,String emp_location){
		super(id,name,work,salary);
		this.emp_id= emp_id;
		this.emp_location=emp_location;
		this.emp_name=emp_name;
		
	}
	public void ManagerWork() {
		System.out.println("mange emp : " + emp_name);
	}
	

}
