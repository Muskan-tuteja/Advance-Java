package jdbc;
import java.sql.*;
import java.io.*;

public class imagesave {
	public static void main(String[] args) {
		try {
			//load the Driver
			Class.forName("org.postgresql.Driver");
			
//			creating a connection
			String url = "jdbc:postgresql://localhost:5432/images_management";
			String username = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String q = "insert into image1(tName,photo) values(?,?)";
			PreparedStatement pstmt = connection.prepareStatement(q);
		
			FileInputStream fis = new FileInputStream("C:\\Users\\Muskan\\OneDrive\\Pictures\\cat.png");
		pstmt.setBinaryStream(1, fis,fis.available());
		
		pstmt.setString(1, "cat image");
		pstmt.setBinaryStream(2, fis);
		pstmt.executeUpdate();
		System.out.println("done...");
		
		}catch(Exception e) {
			System.out.println("Error !!");
			e.printStackTrace();
		}
	}

}
