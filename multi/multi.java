package oop.multi;

public class multi {
    int a=100;
    int b=33;
    void display(){
        System.out.println("this is method multi.display");
    }
    
}
class multi2 extends multi {
    int c=200;

}
class multi3 extends multi2{
    int d=59;
}