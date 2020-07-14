package input.output.r;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class w_files {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("demo.txt");
        try {
            int i = f.read();
            while (i!=-1) {
                System.out.print((char)i);
                i=f.read();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        f.close();
    }
    
}