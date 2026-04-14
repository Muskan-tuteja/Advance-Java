class Access
{
	public static void main(String [] args)
	{
	Fruit f;

	f = new Apple();
	//f= new Fruit();
	//f=new Orange();


	System.out.println(f.price);	//89
	f.details();			//price : 89
	//System.out.println(f.name);	//cte
	//f.appleDetails();		//cte
z
	//Apple a = f ; 		//cte : implicitly it is not possible



	if (f instanceof Apple)
	{
	Apple a = (Apple) f ;	//downCasting 
				//Apple a = (Apple) new Apple();
	System.out.println(a.price);		//89
	a.details();				//price : 89
	System.out.println(a.name);		//Apple

	a.appleDetails();
	}

	else if(f instanceof  Orange)
	{
	Orange aa =(Orange)f;	//downCasting 
				//Apple a = (Apple) new Apple();
	
	System.out.println(aa.price);
	aa.details();
	System.out.println(aa.color);

	//aa.OrangeDetails();		//CTE???????????/
	}

	}

}