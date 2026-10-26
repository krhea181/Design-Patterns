public class ClientBase {
    public static void main(String[] args){
       PaymentStrategy paymentStrategy = new CreditCardPayment(121, 456686688, "Neha k");
       ShoppingCart shoppingCart = new ShoppingCart(paymentStrategy);
       shoppingCart.checkout(106789000);
    }
}
