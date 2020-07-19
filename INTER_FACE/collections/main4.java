package INTER_FACE.collections;

import java.util.LinkedList;

public class main4 {
    public static void main(String[] args) {
        LinkedList<CAR> links = new LinkedList<CAR>();
        CAR c =new CAR(4400, "Series1","Tesla");
        CAR c2 =new CAR(6000, "Series2","Tesla ");
        CAR c3 =new CAR(7894,"Series3","Tesla");
        CAR c4 =new CAR(6589,"Series3","Tesla");
        links.add(c);
        links.add(c2);
        links.add(c3);
        links.add(c4);

        for (CAR car : links) {
            System.out.println(car.brand+ "  "+car.name+ " "+ car.price);
        }
        
    }    
}