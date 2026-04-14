class Calculator
{
void add(int a, int b)
{
System.out.println(a+b);
}
void add(double a, double b)
{
System.out.println(a+b);
}
void add(int a , int b , int c)
{
System.out.println(a*b);
}
void add(int a , double b )
{
System.out.println(a*b);
}
public static void main(. [] args)2.3
{
Calculator c = new Calculator();
c.add(10,20);
c.add(12.8,89.4);
c.add(3,3);
c.add(3,3.9);
}
} 