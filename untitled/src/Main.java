import DatabaseConnection.DatabaseConnection;
import DatabaseConnection.FetchData;
import LoginAndRegistration.Login;
import LoginAndRegistration.Signup;
import Model.UserDetails;
import UserDefinedException.NullException;

import java.util.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, NullException {
//        Signup signup=new Signup();
//        signup.signUp(new UserDetails("nishant","nihnt@ail.com",22,"11-05-2001","male",76997l,"nishant1151"));
//        Login login=new Login();
//        login.login(9307616997l,"nishant");

        Admin.start();
    }

}
