class CarPenter
{
String Name;
Long Phone;
String Address;
int Charge;
public CarPenter()
{

}
public CarPenter(String Name,Long Phone,int Charge)
{
this.Name=Name;
this.Phone=Phone;
this.Charge=Charge;

}
public CarPenter(String Address)
{
this.Address=Address;
}
public CarPenter(String Name,Long Phone,int Charge,String Address)
{
this.Name=Name;
this.Phone=Phone;
this.Charge=Charge;
this.Address=Address;
}
public CarPenter(String Name,Long Phone)
{
this.Name=Name;
this.Phone=Phone;
}
public static void main (String [] args)
{
CarPenter A1 = new CarPenter();
System.out.println("...............");
System.out.println(A1);
System.out.println("...............");

CarPenter A2 = new CarPenter("Isha",12000999L,890);
System.out.println(A2.Name);
System.out.println(A2.Phone);
System.out.println(A2.Charge);
System.out.println("...............");

CarPenter A3 = new CarPenter("HNo21");
System.out.println(A3.Address);
System.out.println("...............");

CarPenter A4 = new CarPenter("Isha",12000999L,890,"Hno890");
System.out.println(A4.Name);
System.out.println(A4.Phone);
System.out.println(A4.Charge);
System.out.println(A4.Address);
System.out.println("...............");


CarPenter A5 = new CarPenter("Isha",12000999L);
System.out.println(A5.Name);
System.out.println(A5.Phone);
System.out.println("...............");
}
}