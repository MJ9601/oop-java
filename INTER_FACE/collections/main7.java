package INTER_FACE.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main7 {

    public static void main(String[] args) {

        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("joe");
        list.add("Mike");
        list.add("Rob");
        list.add("Alexa");
        list.add("john");
        list.remove("Mike");
        list.add("Rob");

        java.util.Iterator<String> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}