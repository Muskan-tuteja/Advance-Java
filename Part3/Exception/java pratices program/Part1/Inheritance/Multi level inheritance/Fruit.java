class Fruit
{
	int price = 90;
 	String region = "India";
	void fruitDetails()
	{
	System.out.println(price);
	}

	public static void main(String [] args)
	{
		Fruit f = new Fruit();
		System.out.println(f.price);
		System.out.println(f.region);
		f.fruitDetails();
		//System.out.println(f.name);
		//System.out.println(f.color);

/* we can't access the child properties by the help of parent refrence*/

		Apple a = new Apple();
		System.out.println(a.price);
		System.out.println(a.region);
		a.fruitDetails();
		System.out.println(a.name);
		System.out.println(a.color);
		a.appleDetails();
	}
}