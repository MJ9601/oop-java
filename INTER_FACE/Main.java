package INTER_FACE;

public class Main {
    public static void main(String[] args) {
        PrivateBank pb = new PrivateBank("joe");
        GovernmentBank gb = new GovernmentBank("Rob");
        pb.interestPaid();
        gb.interestPaid();


    }
}