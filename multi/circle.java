package oop.multi;

public class circle {
    double radius;
    final double pi;
    circle(){
        radius =4;
        pi =3.14;
    }
    double area(){
        double area=pi*radius*radius;
        return area;
    }
    double perimeter(){
        double perimeter=2*pi*radius;
        return perimeter;
    }
    
}