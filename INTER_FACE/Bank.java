package INTER_FACE;

public class Bank {
    public void deposit(){
        System.out.println("Amount has been deposited");
    }
    public void withdraw(){
        System.out.println("Amount has been withdrawed");
        
    }
    private void updateBalance(){
        System.out.println("Balance has been updated");
    }
}
class customer extends Bank{


    
}