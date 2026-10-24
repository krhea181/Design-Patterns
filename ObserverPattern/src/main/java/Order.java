import java.util.ArrayList;
import java.util.List;

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

    void StatusChange(String orderStatus, ObserverHandler observerHandler) {
        observerHandler.notifyObserver();
    }
}


class ObserverHandler {
    // You can use OrderId
    Order order;
    List<OrderObserver> observerList = new ArrayList<>();

    ObserverHandler(Order order){
        this.order=order;
    }

    void updateObserver(OrderObserver orderObserver){
        observerList.add(orderObserver);
    }

    void notifyObserver(){
        for (OrderObserver orderObserver : observerList) {
            orderObserver.notifyStatusChange();
        }
    }

}