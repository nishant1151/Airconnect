import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Signup {

    private static List <UserDetails>list=new ArrayList<>();

    public Signup(String name, String emailId, int age, String datrOfBirth, String gender, long mobileNumber){

        list.add(new UserDetails(name,emailId,age,datrOfBirth,gender,mobileNumber));
        Collections.sort(list);
//        Comparator<UserDetails>comparator=(u,u1)->{
//            if(u.getMobileNumber()>u1.getMobileNumber()){
//                return 1;
//            }
//            else if(u.getMobileNumber()==u1.getMobileNumber()){
//                return 0;
//            }
//            return -1;
//        };
        Comparator<UserDetails> comparator = (u, u1) -> Long.compare(u.getMobileNumber(), u1.getMobileNumber());
        int index = Collections.binarySearch(list, new UserDetails(name, emailId, age, datrOfBirth, gender, mobileNumber));

        System.out.println(index);


    }
}
