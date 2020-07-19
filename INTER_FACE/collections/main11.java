package INTER_FACE.collections;

import java.util.Set;
import java.util.TreeSet;

public class main11 {
    public static void main(String[] args){
        TreeSet<student1> set = new TreeSet<student1>();
        student1 jak = new student1(879, "jak", 87);
        student1 maria=new student1(984,"maria", 65);
        student1 Alexa =new student1(542, "Alexa", 98);
        student1 john = new student1(900, "John", 97);
        
        set.add(jak);
        set.add(maria);
        set.add(Alexa);
        set.add(john);

        for (student1 t:set) {
            System.out.println(t.name + " " + t.id + " " + t.score);
        }
        System.out.println("************");




    }
}