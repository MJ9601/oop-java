package INTER_FACE.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class main8 {
    public static void main(String[] args){
        TreeSet<car1> tree=new TreeSet<car1>();
        car1 car=new car1(1000, "Series1","Tesla");
        car1 car2=new car1(3930,"Series2","Tesla");
        car1 car3=new car1(5489, "Series3","Tesla");

        tree.add(car2);
        tree.add(car3);
        tree.add(car);


        for (car1 c:tree){
            System.out.println(c.brand+" : "+c.name+" : "+c.price);
        }
    }



    
}