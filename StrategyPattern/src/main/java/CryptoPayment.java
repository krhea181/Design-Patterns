public class CryptoPayment implements PaymentStrategy{
    String walletAddress;
    @Override
    public void pay(double amount) {
        System.out.println("Crypto Amount : "+amount + " with address : "+walletAddress);
    }
}
