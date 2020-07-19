package INTER_FACE.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main6 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<String>();
        list.add("joe");
        list.add("Mike");
        list.add("Rob");
        list.add("Alexa");
        list.add("john");
        list.remove("Mike");

        java.util.Iterator<String> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}