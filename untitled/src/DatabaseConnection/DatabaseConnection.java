package DatabaseConnection;


import java.sql.*;
import java.util.Arrays;

public class DatabaseConnection {


    public static Connection databaseConnection() {


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","hr");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            throw new RuntimeException(e);
        }

        return null;

    }
}
