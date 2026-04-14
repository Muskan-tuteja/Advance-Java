class Teacher
{
String T_Name;
int T_id;
Long T_Phn;
int T_age;
 public teacher()
{
System.out.println("Hi");
}
public teacher(int a,int b)
{
T_id=a;
T_age=b;
}
public teacher(long a)
{
T_phn=a;
}
public teacher(String a )
{
T_Name= a;
}
public teacher(int x)
{
T_age = x;
}
public static void main(String [] args)
{
