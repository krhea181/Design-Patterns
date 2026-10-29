public class PaymentAdapter implements PaymentInterface{
    private final PaymentThirdParty paymentThirdParty;

    public PaymentAdapter(PaymentThirdParty paymentThirdParty) {
        this.paymentThirdParty = paymentThirdParty;
    }

    @Override
    public void processPayment(int val, int rupees) {
        int dollars=rupees/100;
        paymentThirdParty.processPay(val,dollars);
    }
}
