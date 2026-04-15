package Mobile;

import java.sql.*;

public class fetchmobile {
	public static void main(String[] args) {
		try {
//			load the driver
			Class.forName("org.postgresql.Driver");
//			Create a connection
			String url = "jdbc:postgresql://localhost:5432/m6jdbc";
			String username="postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			
			String q = "select * from mobile";
			ResultSet resultSet = statement.executeQuery(q);
			
			List<Mobile> mobile = new ArrayList<Mobile>();
			while(resultSet.next()) {
				mobile s = new mobile();
				s.setId(resultSet.getInt("id"));
				s.setName(resultSet.getString("name"));
				mobile.add(s)
				
			}
				
			}
	}
	
	

}
