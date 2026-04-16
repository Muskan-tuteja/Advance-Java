package Mobile;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class fetchmobile {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("org.postgresql.Driver");

            // Create a connection
            String url = "jdbc:postgresql://localhost:5432/mobiledatabase";
            String username = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected: " + connection);

            Statement statement = connection.createStatement();

            String q = "select * from mobile";
            ResultSet resultSet = statement.executeQuery(q);

            List<Mobile> mobileList = new ArrayList<>();

            while (resultSet.next()) {
                Mobile s = new Mobile();
                s.setId(resultSet.getInt("id"));
                s.setName(resultSet.getString("name"));
                mobileList.add(s);
            }

            // 🔥 Print data (important)
            for (Mobile m : mobileList) {
                System.out.println(m.getId() + " " + m.getName());
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}