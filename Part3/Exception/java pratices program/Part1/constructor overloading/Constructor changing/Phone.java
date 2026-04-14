class Phone
{
String Phone_BrandName;
int Phone_ImiNo;
int Phone_Price;
String Phone_Ram;
String Phone_Rom;
public Phone(String Phone_BrandName)
{
this.Phone_BrandName = Phone_BrandName;
}

public Phone(String Phone_BrandName,int Phone_ImiNo)
{
this.Phone_BrandName = Phone_BrandName;
this.Phone_ImiNo = Phone_ImiNo;
}

public Phone(int Phone_Price,String Phone_Ram)
{
this.Phone_Price = Phone_Price;
this.Phone_Ram = Phone_Ram;
}

public Phone(int Phone_Price)
{
this.Phone_Price = Phone_Price * 2;
}

public Phone(String Phone_Ram,String Phone_Rom,int Phone_Price)
{
this.Phone_Ram = Phone_Ram;
this.Phone_Rom = Phone_Rom;
this.Phone_Price = Phone_Price;
}

public Phone()
{

}




public static void main(String [] args)
{
Phone w1 = new Phone("OPPO");
System.out.println(w1.Phone_BrandName);
System.out.println("....................");

Phone w2 = new Phone("OPPO",12345);
System.out.println(w2.Phone_BrandName);
System.out.println(w2.Phone_ImiNo);
System.out.println("....................");

Phone w3 = new Phone(12000,"8GB");
System.out.println(w3.Phone_Price);
System.out.println(w3.Phone_Ram);
System.out.println("....................");

Phone w4 = new Phone(12000);
System.out.println(w4.Phone_Price);
System.out.println("....................");

Phone w5 = new Phone("8GB","12GB",13000);
System.out.println(w5.Phone_Ram);
System.out.println(w5.Phone_Rom);
System.out.println(w5.Phone_Price);
System.out.println("....................");

Phone w6 = new Phone();
System.out.println(w6);
System.out.println("....................");
}
}

