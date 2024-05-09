import LoginAndRegistration.Login;
import LoginAndRegistration.Signup;
import Model.UserDetails;
import UserDefinedException.NullException;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
    public static void start() throws SQLException, NullException {

        boolean flag = true;
        short number;
        Scanner sc = new Scanner(System.in);


        while (flag) {
            System.out.println("""
                    1)Signup
                    2)Login using Email id
                    3)Login using Mobile number
                    4)Exit
                    """);
            number = sc.nextShort();
            switch (number) {
                case 1: {
                    System.out.println("Enter your Name=");
                    String name = sc.next();

                    System.out.println("Enter your Email id=");
                    String emailId = sc.next();

                    System.out.println("Enter your Mobile Number=");
                    long mobileNumber = sc.nextLong();
                    System.out.println("Enter your age");
                    short age = sc.nextShort();
                    System.out.println("Enter your gender");
                    String gender = sc.next();

                    System.out.println("Enter your Date of Birth");
                    String dob = sc.next();

                    System.out.println("Enter your Password");
                    String password = sc.next();

                    Signup signup=new Signup();
                    signup.signUp(new UserDetails(name,emailId,age,dob,gender,mobileNumber,password));
                    System.out.println("*".repeat(50));
                    break;
                }
                case 2: {

                    System.out.println("Enter your Email=");
                    String emailid = sc.next();
                    System.out.println(emailid);
//                       sc.next();
                    System.out.println("Enter your password=");
                    String password = sc.next();
                    System.out.println(password);
//                   sc.next();
                    Login login=new Login();
                   login.login(emailid, password);

                    System.out.println("*".repeat(50));
                    break;
                }
                case 3: {
                    System.out.println("Enter your Mobile Number=");
                    long mobilenumber = sc.nextLong();
                    System.out.println("Enter your password=");
                    String password = sc.next();
                    Login login=new Login();
                    login.login(mobilenumber, password);
                    System.out.println("*".repeat(50));
                    break;
                }
                case 4: {
                    flag = false;
                    System.out.println("*".repeat(50));

                    break;
                }
                default:
                    System.out.println("Invalid input please try again");
                    System.out.println("*".repeat(50));

            }

        }

    }}
