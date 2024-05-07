import java.util.Scanner;

public class Admin {
    public static void start() {

        boolean flag = true;
        short number;
        Scanner sc = new Scanner(System.in);
        UserVerification userVerification = new UserVerification();

        UserVerification userVerification1 = new UserVerification();
        userVerification.signUp("abc", "abc", 12, "11-05-2001", "male", 12345, "abc");
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
                    String name = sc.nextLine();
                    sc.next();
                    System.out.println("Enter your Email id=");
                    String emailId = sc.nextLine();
                    sc.next();
                    System.out.println("Enter your Mobile Number=");
                    long mobileNumber = sc.nextLong();
                    System.out.println("Enter your age");
                    short age = sc.nextShort();
                    System.out.println("Enter your gender");
                    String gender = sc.nextLine();
                    sc.next();
                    System.out.println("Enter your Date of Birth");
                    String dob = sc.nextLine();
                    sc.next();
                    System.out.println("Enter your Password");
                    String password = sc.nextLine();
                    sc.next();
                    userVerification.signUp(name, emailId, age, dob, gender, mobileNumber, password);
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
                    userVerification.loginUser(emailid, password);

                    System.out.println("*".repeat(50));
                    break;
                }
                case 3: {
                    System.out.println("Enter your Mobile Number=");
                    long mobilenumber = sc.nextLong();
                    System.out.println("Enter your password=");
                    String password = sc.nextLine();
                    sc.next();
                    userVerification.loginUser(mobilenumber, password);
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
            userVerification.signUp("abc", "abc", 12, "11-05-2001", "male", 12345, "abc");
            userVerification.loginUser("abc", "abc");
        }

    }}
