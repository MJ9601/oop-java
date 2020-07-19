package INTER_FACE.collections;

import java.util.ArrayList;

public class main10 {
    public static void main(String[] args){
        ArrayList<student> students = new ArrayList<student>();

        student jak=new student(879, "jak", 87);
        student maria=new student(984,"maria", 65);
        student Alexa =new student(542, "Alexa", 98);
        student john =new student(900, "John",97);
        students.add(jak);
        students.add(maria);
        students.add( Alexa);
        students.add( john);

        for (student t : students){
            System.out.println(t.id + " " + t.name+ " " + t.score);
        }
        System.out.println("************");

        for (int i=0; i<students.size(); i++) {
            System.out.println( students.get(i).name + " " + students.get(i).id + " " + students.get(i).score);
        }
        
    }
}
