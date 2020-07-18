package INTER_FACE;


interface BankRules {
    void interestPaid();
    
}
class PrivateBank implements BankRules {
    String customerName;
    PrivateBank(String customerName) {
        this.customerName = customerName;

    }

    @Override
    public void interestPaid() {
        // TODO Auto-generated method stub
        System.out.println(this.customerName+" is paid an interest of %5" );

    }
}
class GovernmentBank implements BankRules{
    String customerName;
    GovernmentBank(String customerName){
        this.customerName = customerName;
    }

    @Override
    public void interestPaid() {
        // TODO Auto-generated method stub
        System.out.println(this.customerName+" is paid an interest of %7" );

    }
}