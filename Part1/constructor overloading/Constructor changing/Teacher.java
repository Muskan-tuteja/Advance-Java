class Teacher
{
String Teacher_Name;
int Teacher_id;
Long Teacher_Phone;
int Teacher_age;
public Teacher(String Teacher_Name,Long Teacher_Phone)
{
this.Teacher_Name=Teacher_Name;
this.Teacher_Phone=Teacher_Phone;
}
public Teacher(String Teacher_Name,int Teacher_id)
{
this.Teacher_Name=Teacher_Name;
this.Teacher_id=Teacher_id;
}
public Teacher(Long Teacher_Phone,int Teacher_age)
{
this.Teacher_Phone=Teacher_Phone;
this.Teacher_age=Teacher_age;
}
public Teacher(int Teacher_age,String Teacher_Name)
{
this.Teacher_age=Teacher_age;
this.Teacher_Name=Teacher_Name;

}
public Teacher(int Teacher_age, Long Teacher_Phone)
{
this.Teacher_age=Teacher_age;
this.Teacher_Phone=Teacher_Phone;
}


public static void main(String [] args)
{
Teacher A1= new Teacher("Mahi",243345677L);
System.out.println(A1.Teacher_Name);
System.out.println(A1.Teacher_Phone);
System.out.println(".....................");


Teacher A2= new Teacher("Mahhi",2309);
System.out.println(A2.Teacher_Name);
System.out.println(A2.Teacher_id);

System.out.println(".....................");

Teacher A3= new Teacher(2345678989L,20);
System.out.println(A3.Teacher_Phone);
System.out.println(A3.Teacher_age);
System.out.println(".....................");

Teacher A4 = new Teacher(45,8908976589L);
System.out.println(A4.Teacher_age);
System.out.println(A4.Teacher_Phone);


System.out.println(".....................");

Teacher A5 = new Teacher(34,89988779900L);
System.out.println(A5.Teacher_age);
System.out.println(A5.Teacher_Phone);

System.out.println(".....................");



}
}