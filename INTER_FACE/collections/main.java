package INTER_FACE.collections;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Car");
        list.add("Jaguar");
        System.out.println(list.get(1));
        list.set(1, "BMW");
        list.add("Cheeta");
        System.out.println(list.get(1));
        if (list.contains("Jaguar")){
            System.out.println("it is there");

        }else{
            System.out.println("it is not there");
        }
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(String cars:list){
            System.out.println(cars);
        }


        list.remove("Car");
        for (String cars:list){
            System.out.println(cars);
        }
        System.out.println(list.size());
        String s[]=new String[list.size()];
        s=  list.toArray(s);
        for (int i=0; i<list.size(); i++) {
            System.out.println(s[i]);
        }
    }

    
}