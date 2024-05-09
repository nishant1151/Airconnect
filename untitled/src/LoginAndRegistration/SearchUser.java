package LoginAndRegistration;

import DatabaseConnection.FetchData;
import UserDefinedException.NullException;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

public class SearchUser {

    public static boolean searchUser(Long mobileNumber){
        try{

          Map<Long,String> map= FetchData.fetchUserMobileNumber();
           return map.containsKey(mobileNumber);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean searchUser(String emailId){
        try{

            Map<String,String> map= FetchData.fetchUserEmail();
            return map.containsKey(emailId);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean searchUser(String emailId,String password){
        try{

            Map<String,String> map= FetchData.fetchUserEmail();
            return map.containsKey(emailId) && map.get(emailId).equals(password);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean searchUser(Long mobileNumber,String password){
        try{

            Map<Long,String> map= FetchData.fetchUserMobileNumber();
            System.out.println( map.containsKey(mobileNumber)+""+map.get(mobileNumber));
            return map.containsKey(mobileNumber) && map.get(mobileNumber).equals(password);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
