package Mobile;

import java.sql.*;

public class JDBCMobile {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/mobiledatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			String query = "create table mobile(brand varchar(20) , price numeric(9) , model varchar(10), refno numeric(12) primary key);";
			
			statement.execute(query);
			
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}	