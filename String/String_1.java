package String;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args){
        String userName = new String();
        String password = new String();
        Scanner s1= new Scanner(System.in);
        int k=0;

        while (k!=1) {
            

            System.out.println("Enter your user name");
            userName=s1.next();
            System.out.println("Enter your password");
            password=s1.next();
            if (userName.length()<=6) {
                System.out.println("your user name is invalid");
                
            }else if (password.length()<=8){
                System.out.println("your password is invalid");
            }else{
                System.out.println("every thing looks good");
                k=1;
                
            }
        }

    }
    
}