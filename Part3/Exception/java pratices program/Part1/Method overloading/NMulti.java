class NMulti{
  void Mul(int a)
{
System.out.println( a*3);
}
 void Mul(int a,int b)
{
System.out.println(a*b);
}
 void Mul(int a, int b ,int c)
{
System.out.println(a*b*c);
}
public static void main(String [] args)
{
NMulti obj = new NMulti();
obj.Mul(10);
obj.Mul(15,2);
obj.Mul(93,12,8);
}
}

