class Car{
String Name;
long phone;
String Address;
double charge;

Car(String Name)
{
this.Name = Name;//this keyword
}
Car(String Name, long phone)
{
this(Name);// this() call statement
this.phone= phone;
}
Car(String Name, long phone, String Address){
this(Name,phone);//this call statement
this.Address = Address;
}
Car(String Name, long phone, String Address,double charge)
{
this();
this(Name,phone,Address);//this call statement
this.charge=charge;
}
Car()
{

}
public static void main(String [] args)
{
Car c1= new Car("Muskan");
System.out.println(c1.Name);
Car c2= new Car("Muskan",788008777L);
System.out.println(c2.Name);
System.out.println(c2.phone);
Car c3= new Car("Muskan",788008777L,"Delhi");
System.out.println(c3.Name);
System.out.println(c3.phone);
System.out.println(c3.Address);
Car c4= new Car("Muskan",788008777L,"Delhi",3456.78);
System.out.println(c4.Name);
System.out.println(c4.phone);
System.out.println(c4.Address);
System.out.println(c4.charge);
Car c5= new Car();
System.out.println(c5);

}
}

