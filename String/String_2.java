package String;

import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {
        String sentence= new String();
        String c= new String();

        int k=0;
        Scanner s=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        sentence=s.next();
        System.out.print("Enter the letter you want counted : ");
        c = s2.nextLine();
        char cs=c.charAt(0);
        
        System.out.print(cs);
        for(int i=0; i<sentence.length(); i++){
            
            if (sentence.charAt(i)==cs){
                k++;
            } 


        }
        System.out.println(k);

        
    }
}