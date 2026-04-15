package BikeProject;
import java.sql.*;

public class InsertingDataBike {
public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/bikedatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
//			String que = "insert into bike values('Hero' ,70000, 'Splendor');";
//			String que = "insert into bike values('TVS' ,90000, 'Apache');";  
//			String que = "insert into bike values('Yamaha' ,100000, 'X100');";  
//			String que = "insert into bike values('Honda' ,80000, 'Splendor+');";  
			String que = "insert into bike values('Active' ,50000, '5G');";  
			
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
