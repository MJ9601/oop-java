package INTER_FACE.collections;

public class car1  implements Comparable<car1> {
    int price;
    String name;
    String brand;
    car1(int price, String name, String brand){
        this.price = price;
        this.name = name;
        this.brand = brand;
    }

    @Override
    public int compareTo(car1 o) {
        // TODO Auto-generated method stub

        if (price>o.price){
            return 1;

        }else if (price<o.price){
            return -1;
        }else{
            return 0;
        }

    }
}
