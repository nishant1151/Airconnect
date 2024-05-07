package LoginAndRegistration;

import DatabaseConnection.FetchData;

import java.sql.SQLException;

public class SearchUser {
    public static boolean searchUser(Long mobileNumber){
        try{

            FetchData.fetchMobileNumberFromUser();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
