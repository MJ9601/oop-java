package String;

import java.util.Scanner;

public class String_3 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String userName = "admin";
        String password = "adminuser";
        String EnteredUserName= new String();
        String EnteredUserPassword= new String();
        int k=0;

        while (k!=-1 && k<3) {
            
            System.out.println("Enter your user Name");
            EnteredUserName=s.next();

            if (EnteredUserName.equals(userName)){
                System.out.println("Enter your user Password");
                EnteredUserPassword=s.next();
                if (EnteredUserPassword.equals(password)){
                    System.out.println("Access granted");
                    k=-1;

                }else{
                    System.out.println("Access denied\n Invalid Password");
                    k++;
                }

            }else{
                System.out.println("Access denied\n user Name");
                k++;
            }
        }
        if (k>1) {
            System.out.println("your access to the system is limited\n you can not access to the system untill next hour");
            
        }

        

    }
}