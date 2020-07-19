package INTER_FACE.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class main5 {

    public static void main(String[] args){
        

        List<String> list =new ArrayList<String>();
        list.add("joe");
        list.add("Mike");
        list.add("Rob");
        list.add("Alexa");
        list.add(3,"john");
        list.remove("Mike");
        System.out.println(list.get(0));

        ListIterator it= list.listIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}