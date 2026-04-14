class Userr
{
	// data members 
	public String Name = "ABCD";
	public int id = 2309;
        public int sal = 12330;

	public static void getName()
	{
		System.out.println(Name);
	}

	public static void getid()
	{
		System.out.println(id);
	}  
        public static void getsal()
	{
		System.out.println(sal);
	}

	public static void main(String [] args)
	{
		Userr.Name();
                 Userr.id();
                 Userr.sal();
	}
}	