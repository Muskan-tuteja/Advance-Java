package jdbc;
import java.sql.*;

public class Selectjdbcstudent {
	public static void main(String[] args) {
		try {
			
			Connection con= ConnectionProvider.getConnection();
		String query = "select * from table1";
		
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(query);
		
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);
			
			System.out.println(id + " | " + name + " | " + city);
		}
		
		
		
		
		
		}catch(Exception e) {
			System.out.println("Error ....");
			e.printStackTrace();
		}
	}

}
