//non-static => non-static

class Prog1{
	
void m1()
{
System.out.println("mkih");
}

void m2()
{
System.out.println("nig");

m1();  //direct call

this.m1();

Prog1 value = new Prog1();
value.m1();

}

public static void main(String []args)
{

Prog1 value2 = new Prog1();
value2.m2();

}

}