public class CreditCardPayment implements PaymentStrategy{
    int cvv;
    int cardNumber;
    String cardHolderName;

    CreditCardPayment(int cvv, int cardNumber, String cardHolderName){
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.cardHolderName=cardHolderName;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Credit Payment : "+amount+" credit card holder name "+this.cardHolderName);
    }
}
