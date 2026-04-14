class NSub{
 void Sub(int a)
{
System.out.println( a-3);
}
 void Sub(int a,int b)
{
System.out.println(a-b);
}
 void Sub(int a, int b ,int c)
{
System.out.println(a-b-c);
}
public static void main(String [] args)
{
NSub obj = new NSub();
obj.Sub(10);
obj.Sub(15,2);
obj.Sub(93,12,8);
}
}

