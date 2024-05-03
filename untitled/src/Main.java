import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
       boolean flag=true;
       short number;
       Scanner sc=new Scanner(System.in);
       UserVerification userVerification=new UserVerification();

       while(flag) {
           System.out.println("""
                   1)Signup
                   2)Login using Email id
                   3)Login using Mobile number
                   3)Exit
                   """);
           number=sc.nextShort();
           switch(number){
               case 1: {
                   System.out.println("Enter your Name=");
                   String name = sc.nextLine();
                   System.out.println("Enter your Email id=");
                   String emailId = sc.nextLine();
                   System.out.println("Enter your Mobile Number=");
                   long mobileNumber = sc.nextLong();
                   System.out.println("Enter your age");
                   short age = sc.nextShort();
                   System.out.println("Enter your gender");
                   String gender = sc.nextLine();
                   System.out.println("Enter your Date of Birth");
                   String dob = sc.nextLine();
                   System.out.println("Enter your Password");
                   String password = sc.nextLine();
                   userVerification.signUp(name, emailId, age, dob, gender, mobileNumber, password);
                   System.out.println("*".repeat(50));
                   break;
               }
                   case 2:{
                       System.out.println("Enter your Email=");
                       String emailid = sc.nextLine();
                       System.out.println("Enter your password=");
                       String password = sc.nextLine();
                       userVerification.loginUser(emailid,password);
                       System.out.println("*".repeat(50));
                       break;

                   }
               case 3:{
                   System.out.println("Enter your Mobile Number=");
                   long mobilenumber = sc.nextLong();
                   System.out.println("Enter your password=");
                   String password = sc.nextLine();
                   userVerification.loginUser(mobilenumber,password);
                   System.out.println("*".repeat(50));
                   break;
               }
               case 4:{
                   flag=false;
                   System.out.println("*".repeat(50));

                   break;
               }
               default:
                   System.out.println("Invalid input please try again");
                   System.out.println("*".repeat(50));



               }
           }
       }
}

