class B{
int x = 8;
static int y =9;
public static void m1()
{
System.out.println("Hy");
}
public void m2()
{
System.out.println("Hello");
}
public static void main(String [] args)
{
System.out.println(y);
m1();
System.out.println(B.y);
B.m1();
 B a = new B();
System.out.println(a.y);
a.m1();

System.out.println(a.x);
a.m2();
}
}


