package INTER_FACE.collections;

import java.util.ArrayList;

public class main2 {
    public static void main(String[] args){
        CAR c1= new CAR(2000, "Series1", "BMW");
        CAR c2= new CAR(2000, "Series2", "BMW");
        CAR c3= new CAR(2000, "Series3", "BMW");
        ArrayList<CAR> cars = new ArrayList<CAR>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        for (int i = 0; i <cars.size(); i++) {
            System.out.println(cars.get(i).brand +" " +cars.get(i).name + " " +cars.get(i).price);
        }
        for (CAR c:cars){
            System.out.println(c.brand);
        }
    }
}