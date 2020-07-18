package INTER_FACE.collections;

import java.util.ArrayList;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import javax.swing.text.html.HTMLDocument.Iterator;


public class main1 {
    private static final String Series1 = null;
    private static final String BMW = null;

    public static void main(String[] args){
        ArrayList list=new ArrayList<String>();

        list.add("BMW");
        list.add("Jaguar");
        list.add("Bogatti");
        list.add("Tesla");
        java.util.Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
        
        
        

    }
}