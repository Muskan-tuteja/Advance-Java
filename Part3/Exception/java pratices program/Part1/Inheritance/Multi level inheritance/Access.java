class Access
{
	public static void main(String [] args)
	{
		Fruit f = new Fruit();
		System.out.println(f.price);
		System.out.println(f.region);
		f.fruitDetails();
		//System.out.println(f.name);
		//System.out.println(f.color);
		//f.fruitDetails();
		System.out.println(f.toString());	//Fruit@

/* we can't access the child properties by the help of parent refrence*/

		Apple a = new Apple();
		System.out.println(a.price);
		System.out.println(a.region);
		a.fruitDetails();
		System.out.println(a.name);
		System.out.println(a.color);
		a.appleDetails();
		Apple b = a;
		Apple c = new Apple();
		System.out.println(a.toString());	//Apple@
		System.out.println(a.hashCode());	//hashcode vale
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
	}
}