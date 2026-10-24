import java.util.ArrayList;
import java.util.List;

// Tight coupling between Order and ObserverHandler -> This isn't needed -> Try to add objects in methods if needed
// Don't add classes as field even when it's not necessary.
public class Order {
    private int orderId;
    private String orderDesc;
    private String orderStatus;
    private boolean delPatAssigned;

    Order(int orderId, String orderDesc) {
        this.orderId=orderId;
        this.orderDesc=orderDesc;
        this.orderStatus="PENDING";
    }

    int getOrderId(){
        return this.orderId;
    }

    void statusChange(String orderStatus, ObserverHandler observerHandler) {
        this.orderStatus=orderStatus;
        observerHandler.notifyObserver(this);
    }
}


class ObserverHandler {
    List<OrderObserver> observerList = new ArrayList<>();

    void addObserver(OrderObserver orderObserver){
        observerList.add(orderObserver);
    }

    void notifyObserver(Order order){
        for (OrderObserver orderObserver : observerList) {
            orderObserver.notifyStatusChange(order);
        }
    }

}