package String;

import java.util.Scanner;

public class String__4 {
    public static void main(String[] args){
        String sentence="The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog";
        String sc= new String();
        String sc1=new String();
        Scanner SC2=new Scanner(System.in);
        System.out.println("Enter the target word");
        sc=SC2.next();
        System.out.println("Enter the word you want to replace wiht tatget word");
        sc1=SC2.next();
        
        String s1=sentence.replace(sc,sc1);
        System.out.print(s1);
    }
    
}