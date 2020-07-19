package String;

public interface Car {
    public void drive();
    public void stop(); 
    
}
class Vehicle implements Car {

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Driving");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stopping");

    }
    
}