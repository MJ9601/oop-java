package oop.exeptions;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int currentBalance = 1000;
        System.out.println("Enter deposit amount: ");
        Scanner sc = new Scanner(System.in);
        int depositAmount = sc.nextInt();
        try {
            if (depositAmount<=0){
                throw new NegativeAmont();
            }else{
                currentBalance +=depositAmount;
                System.out.println("the new current Balance is " +currentBalance);
            }
        } catch (NegativeAmont e) {
            //TODO: handle exception
            System.out.println(e);
        }


    }

    
}