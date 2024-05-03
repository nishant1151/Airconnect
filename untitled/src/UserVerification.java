import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserVerification {

    private  List<UserDetails> list = new ArrayList<>();

    public  void signUp(String name, String emailId, int age, String datrOfBirth, String gender, long mobileNumber,String password) {
        Collections.sort(list);
        Comparator<UserDetails> comparator=(o1,o2)->{
            if(o1.getMobileNumber()==o2.getMobileNumber()){
                return 0;
            } else if (o1.getMobileNumber()>o2.getMobileNumber()) {
                return 1;
            }
            return -1;
        };
        int emailChecker = Collections.binarySearch(list, new UserDetails(name, emailId, age, datrOfBirth, gender, mobileNumber,password));
        Collections.sort(list,comparator);
        int mobileNumberChecker=Collections.binarySearch(list, new UserDetails(name, emailId, age, datrOfBirth, gender, mobileNumber,password),comparator);

        if (emailChecker <0 && mobileNumberChecker<0) {
            list.add(new UserDetails(name, emailId, age, datrOfBirth, gender, mobileNumber,password));
            System.out.println("signup Successfull");
        }
        else
        {
            System.out.println("Emailid or MobileNumber Already Exists");
        }


    }


    public void loginUser(String email ,String password){
        Collections.sort(list);
    int index=    Collections.binarySearch(list,new UserDetails("",email,0,"","",00,""));
        if(index>=0 && list.get(index).getPassword().equals(password)){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("invalid password or emailid");
        }
    }
    public void loginUser(long mobileNumber,String password){
        Comparator<UserDetails> comparator=(o1,o2)->{
            if(o1.getMobileNumber()==o2.getMobileNumber()){
                return 0;
            } else if (o1.getMobileNumber()>o2.getMobileNumber()) {
                return 1;
            }
            return -1;
        };
        Collections.sort(list,comparator);
        int index=    Collections.binarySearch(list,new UserDetails("","",0,"","",mobileNumber,""),comparator);
        if(index>=0 && list.get(index).getPassword().equals(password)){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("invalid password or emailid");
        }


    }
}