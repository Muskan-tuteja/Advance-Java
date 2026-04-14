class NAdd{
  void add(int a)
{
System.out.println( a+3);
}
  void add(int a,int b)
{
System.out.println(a+b);
}
 void add(int a, int b ,int c)
{
System.out.println(a+b+c);
}
public static void main(String [] args)
{
NAdd obj = new NAdd();

obj.add(3);
obj.add(5,6);
obj.add(13,67,8);
}
}

