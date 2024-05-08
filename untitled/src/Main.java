import DatabaseConnection.DatabaseConnection;
import DatabaseConnection.FetchData;
import LoginAndRegistration.Signup;
import UserDefinedException.NullException;

import java.util.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, NullException {
        Signup signup=new Signup();
        signup.signUp(9307616987l,"nishant",25,"nishant@gmail.com","11-05-2001","male","nishant");


    }
}
