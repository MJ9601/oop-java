package oop;

public class student {
    int id;
    int phy;
    int chem;
    int math;
    student(int id, int phy, int chem, int math){
        this.id =id;
        this.phy =phy;
        this.math=math;
        this.chem=chem;
        System.out.println("the constructor is being called");
    }
    student(){
        id=1;
        chem=10;
        phy=60;
        math=90;
        System.out.println("the constructor 2 is being called");
    }
    void displayMarks() {
        System.out.println("the physic marks "+ phy);
        System.out.println("the chemstry marks "+chem);
        
    }
    double precentage(int sumx) {
        return(sumx /3);
    }

    int sum(){
        return ((phy+chem+math));
    }


}
