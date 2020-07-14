package oop.multi;

public class parent {
    void display(){
        System.out.println("the name is joe");
    }
    void wealth(){
        System.out.println("the parents have 1000 income");
    }
    final void displaySurname(){
        System.out.println("Ford");
    }
    
}
class child extends parent {
    void display(){
        System.out.println("the name is john");
    }
}