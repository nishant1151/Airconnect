package LoginAndRegistration;

import DatabaseConnection.FetchData;
import UserDefinedException.NullException;

import java.sql.SQLException;
import java.util.Set;

public class SearchUser {
    public static boolean searchUser(Long mobileNumber){
        try{

           Set<Long> set= FetchData.fetchMobileNumberFromUser();
           return set.contains(mobileNumber);

        }catch(SQLException | NullException e){
            e.printStackTrace();
        }
        return false;
    }
}
