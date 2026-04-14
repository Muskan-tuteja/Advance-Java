class User 
{
String Name;
int Id;
int Salary;
Long Phone;
public User(String Name)
{
this.Name=Name;
}
public User(int Id,int Salary)
{
this.Id=Id;
this.Salary=Salary;
}
public User(Long Phone)
{
this.Phone=Phone;
}
public static void main (String [] args)
{
User A1 = new User("Isha");
System.out.println(A1.Name);

User A2 = new User(23,12000);
System.out.println(A2.Id);
System.out.println(A2.Salary);

User A3 = new User(7899767899L);
System.out.println(A3.Phone);
}
}