public class ClientBase {
    public static void main(String[] args){
       ShoppingCart shoppingCart = new ShoppingCart();
       PaymentStrategy paymentStrategy = new CreditCardPayment(121, 456686688, "Neha k");
       shoppingCart.checkout(paymentStrategy,106789000);
    }
}
