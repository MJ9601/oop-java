package lambda_function;

public class main {
    public static void main(String[] args){
        Number n;
        n= ()-> 100;
        System.out.println(n.displayNumber());


        Demo t;
        t=(a)->a*300;
        System.out.println(t.demoMethod(400));


        Multiple d;
        d=(a,b)->a*b;
        System.out.println(d.Multipler(399, 893));
        
    }
}
interface Number {
    int displayNumber();
    
}
interface Demo {
    int demoMethod(int a);

}
interface Multiple{
    double Multipler(double a,double b);
}