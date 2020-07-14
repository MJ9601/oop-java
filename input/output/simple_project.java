package input.output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

public class simple_project {
    public static void main(String[] args) throws IOException {
        // writing in to file
 //       FileOutputStream file = new FileOutputStream("balance.txt");
 //       String s = "1000";
 //       byte b[] = s.getBytes();
 //       file.write(b);
 //       file.close();

        //reading back form the file
        Scanner Sc1 = new Scanner(new File("balance.txt"));
        int currentBalance = Sc1.nextInt();
        System.out.print("the current balance is " + currentBalance);

        //get the deposit amonut
        System.out.println("\n Enter the deposit amount");
        Scanner sc = new Scanner(System.in);
        int depositAmount = sc.nextInt();
        try {
            if (depositAmount<0){
                throw new Exception("the Nagative deposit amonut is not allowed");
            }else{
                //calculating new balance amount and writing it to the file again!!
                currentBalance += depositAmount;
                System.out.println(" \n the Update Balance is " + currentBalance);
                String deposit=Integer.toString(currentBalance);
                byte current[]=deposit.getBytes();
                FileOutputStream fil=new FileOutputStream("balance.txt");
                fil.write(current);
                fil.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

        

        
        
    }
}
