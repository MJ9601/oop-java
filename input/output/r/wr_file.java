package input.output.r;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class wr_file {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("Demo.txt");
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        System.out.println("Enter the text here that you wanna write in file");
        String s= br.readLine();
        //String s="this is a test file that should be written to a file";
        byte b[]= s.getBytes();
        f.write(b);
        f.close();
        

    }
    
}