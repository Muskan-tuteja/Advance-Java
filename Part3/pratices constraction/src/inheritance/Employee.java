package inheritance;

public class Employee {
	public int id;
	public String name;
	public String work;
	public int salary;

	
	Employee() {
		this.id=-1;
		this.name="";
		this.work="";
		this.salary=0;
		
	}
	
	Employee ( int id, String name, String work,int salary ) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.work = work;
	}
	public void EmployeeWork() {
		System.out.println("work the emplyee : " + name);
		
	}
	public void Employeesalary() {
		System.out.println("salary the emplyee : " + salary);
		
	}
}


