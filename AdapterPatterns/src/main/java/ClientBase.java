public class ClientBase {
    public static void main(String[] args){
        PaymentThirdParty paymentThirdParty = new PaymentThirdParty();
        PaymentAdapter paymentAdapter = new PaymentAdapter(paymentThirdParty);
        paymentAdapter.processPayment(100,500);
    }
}
