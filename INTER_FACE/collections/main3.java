package INTER_FACE.collections;

import java.util.Iterator;
import java.util.LinkedList;


public class main3 {
    public static void main(String[] args) {
        LinkedList<String> links = new LinkedList<String>();
        links.add("alexa");
        links.add("joe");
        links.add("Robi");
        links.add("rose");

        links.add(1,"phillip");
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ford");
        list.add("Merc");
        list.add("BMW");
        links.addAll(list);
        links.addFirst("bob");
        links.addLast("gaya");
        links.remove("joe");
        links.remove(3);
        links.clear();

        Iterator<String> it = links.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

        
    }
}