class Apple extends Fruit
{
	String name = "Apple";
	String color = "Green";

	void appleDetails()
	{
	
		System.out.println(name);
		System.out.println(color);
	}

		public static void main(String [] args)
	{
		Fruit f = new Fruit();
		System.out.println(f.price);
		System.out.println(f.region);
		f.fruitDetails();
		//System.out.println(f.name);
		//System.out.println(f.color);
		//f.fruitDetails();

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