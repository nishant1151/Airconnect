package LoginAndRegistration;

import DatabaseConnection.FetchData;
import UserDefinedException.NullException;

import java.sql.SQLException;
import java.util.Map;

public class Login{
    public void login(long mobileNumber,String password) throws SQLException, NullException {

        if(SearchUser.searchUser(mobileNumber,password)){
            System.out.println("login successfull");
        }
        else{
            System.out.println("incorrect  Number  or Password");
        }
    }
    public void login(String emailId,String password) throws SQLException, NullException {

        if(SearchUser.searchUser(emailId,password)){
            System.out.println("login successfull");
        }
        else{
            System.out.println("incorrect  Number  or Password");
        }
    }
}
