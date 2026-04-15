package BikeProject;

import java.sql.*;

public class fetchdata {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/fetchdata";
			String username = "postgres";
			String password = "root";
			
             Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
			String q = "select * from ;";
			
			ResultSet resultSet = statement.executeQuery(q);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString("name"));
				System.out.println("-----------------");
				
			}
		}catch (ClassNotFoundException e){
			e.printStackTrace();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
