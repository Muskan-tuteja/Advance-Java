class KashmirApple extends Apple
{
	String kname = "KashmirApple";
	String kcolor = "Red";

	void appleDetails()
	{
	
		System.out.println(kname);
		System.out.println(kcolor);
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

		KashmirApple k = new KashmirApple();
		System.out.println(k.price);
		System.out.println(k.region);
		k.fruitDetails();
		System.out.println(k.name);
		System.out.println(k.color);
		k.appleDetails();
		System.out.println(k.kname);
		System.out.println(k.kcolor);
		k.appleDetails();
	
	}
}