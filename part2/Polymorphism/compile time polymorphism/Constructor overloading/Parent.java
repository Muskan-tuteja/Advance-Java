class Parent 
{
public static void test()
{
System.out.println("From Parent");
}
class Child extends Parent
{
public static void test()
{
System.out.println("FromChild");
}
public static void main(String [] args)
{
Parent p = new Child();
p.test();
}
}