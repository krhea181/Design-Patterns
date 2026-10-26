import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<String> ls=new ArrayList<>();
    PaymentStrategy paymentStrategy;
    ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
