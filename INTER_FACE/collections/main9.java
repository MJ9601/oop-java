package INTER_FACE.collections;

import java.util.ArrayList;

public class main9 {
    public static void main(String[] args){
        ArrayList<String> food= new ArrayList<String>();
        food.add("gormosabzi");
        food.add("cholo");
        food.add("mahPolo");

        for (int i = 0; i <food.size(); i++){
            System.out.println(food.get(i));
        }
        for(String f:food){
            System.out.println(f);
            
        }

    }
}