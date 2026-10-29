public class PaymentProcessor implements PaymentInterface {


    @Override
    public void processPayment(int val, int rupees) {
        System.out.println(rupees + " Rupees are getting processed!!");
    }
}
