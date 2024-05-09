package DatabaseConnection;

import UserDefinedException.NullException;

import javax.swing.*;
import java.sql.*;
import java.util.*;

public class FetchData {
    public static ResultSet fetchUserDetails()  {

        try {
            if (DatabaseConnection.databaseConnection() != null) {
                Connection connection = DatabaseConnection.databaseConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
                ResultSet resultSet = preparedStatement.executeQuery();


                return resultSet;

            } else {
                throw new NullException();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
    public static Map fetchUserMobileNumber() throws SQLException {
        Map<Long,String> map=new TreeMap<>();
        ResultSet resultSet=fetchUserDetails();
        while (resultSet.next()) {
            map.put(resultSet.getLong(5), resultSet.getString(3));
        }
        return map;
    }

    public static Map fetchUserEmail() throws SQLException {
        Map<String,String> map=new TreeMap<>();
        ResultSet resultSet=fetchUserDetails();
        while (resultSet.next()) {
            map.put(resultSet.getString(4), resultSet.getString(3));
        }
        return map;
    }

    public static int fetchUSerId() throws SQLException {
        int data=0;
        List<Integer>list=new ArrayList<>();
        ResultSet resultSet=fetchUserDetails();
        while(resultSet.next()){
           list.add(resultSet.getInt(1));
        }
        Collections.sort(list);

        return list.get(list.size()-1);


    }

}
