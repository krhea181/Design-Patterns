import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<String> ls=new ArrayList<>();
    void checkout(PaymentStrategy paymentStrategy,int amount){
        paymentStrategy.pay(amount);
    }
}
