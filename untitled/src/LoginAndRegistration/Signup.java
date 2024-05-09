package LoginAndRegistration;

import DatabaseConnection.DatabaseConnection;
import Model.UserDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Signup {

    public void signUp(UserDetails userDetails) throws SQLException {
        if(SearchUser.searchUser(userDetails.getMobileNumber())!=true && SearchUser.searchUser(userDetails.getEmailId())!=true){
           Connection connection= DatabaseConnection.databaseConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?,?,?,?,to_date(?,'dd-mm-yyyy'),?)");
            preparedStatement.setInt(1,userDetails.getUserId());
            preparedStatement.setString(2, userDetails.getName());
            preparedStatement.setString(3, userDetails.getPassword());
            preparedStatement.setString(4, userDetails.getEmailId());
            preparedStatement.setLong(5,userDetails.getMobileNumber());
            preparedStatement.setString(6,userDetails.getDateOfBirth());
            preparedStatement.setString(7, userDetails.getGender());
            preparedStatement.execute();
            System.out.println("Sign up successfully");
        }
        else {
            System.out.println("User already exists please login");
        }
    }


}
