package input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        PrintWriter p= new PrintWriter(System.out,true);
        System.out.println("you should write something here");
        try {
            String sentence = b.readLine();
            p.println(sentence);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
    
}