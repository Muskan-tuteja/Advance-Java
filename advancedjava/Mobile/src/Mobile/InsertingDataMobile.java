package Mobile;

import java.sql.*;

public class InsertingDataMobile {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/mobiledatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
//			String que = "insert into mobile values('Gionee' ,28000 , 'S15' , 190383453212);";
//			String que = "insert into mobile values('Motorola' ,13000 , 'Moto G64' , 897342218436);";
//			String que = "insert into mobile values('Redmi' ,28000 , 'Note 4 pro' , 947488437853);";
//			String que = "insert into mobile values('Poco' ,28000 , 'C55' , 190858458512);";
			String que = "insert into mobile values('Realme' ,28000 , 'Note 18' , 19043665312);";
		
			statement.executeUpdate(que);
			
			connection.close();
		} 
		catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
