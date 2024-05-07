package DatabaseConnection;

import UserDefinedException.NullException;

import java.sql.*;
import java.util.*;

public class FetchData {
    public static Set  fetchMobileNumberFromUser() throws SQLException, NullException {
        Set <Long>set =new TreeSet<>();

        if(DatabaseConnection.databaseConnection()!=null){
            Connection connection= DatabaseConnection.databaseConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("select * from users");
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next())  {
              set.add(resultSet.getLong(5));
            }
            return set;

        }
        else {
            throw new NullException();
        }

    }
}
