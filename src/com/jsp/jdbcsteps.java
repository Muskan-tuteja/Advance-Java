package com.jsp;

public class jdbcsteps {
	public static void main(String[] args) {
		//load the drive
		
		try{
			Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
