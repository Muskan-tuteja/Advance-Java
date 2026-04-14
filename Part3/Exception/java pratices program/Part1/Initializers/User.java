class User
{
	// data members 
	private String Name = "ABCD";
	private int id = 2309;
        private int sal = 12330;

	public void getName()
	{
		System.out.println(Name);
	}

	public void getid()
	{
		System.out.println(id);
	}  
        public void getsal()
	{
		System.out.println(sal);
	}

	public static void main(String [] args)
	{
		User s = new User();
		System.out.println(s.Name);
		System.out.println(s.id);
		System.out.println(s.sal);
	}
}	