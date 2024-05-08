package LoginAndRegistration;

import DatabaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Signup {

    public void signUp(long mobileNumber,String name,int age,String emailId,String dob,String gender,String Password) throws SQLException {
        if(SearchUser.searchUser(mobileNumber)!=true){
           Connection connection= DatabaseConnection.databaseConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?,?,?,?,to_date(?,'dd-mm-yyyy'),?)");
           preparedStatement.setInt(1,2);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,Password);
            preparedStatement.setString(4,emailId);
            preparedStatement.setLong(5,mobileNumber);
            preparedStatement.setString(6,dob);
            preparedStatement.setString(7,gender);
            preparedStatement.execute();
            System.out.println("login successfully");
        }
        else {
            System.out.println("User already exists please login");
        }
    }
}
