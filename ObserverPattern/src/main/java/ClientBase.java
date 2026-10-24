public class ClientBase {
    public static void main(String[] args){
       Order order = new Order(101, "101 order is being made");
       ObserverHandler observerHandler = new ObserverHandler();
       OrderObserver orderObserver1 = new EmailNotification();
       OrderObserver orderObserver2 = new InventoryManage();
       observerHandler.addObserver(orderObserver1);
       observerHandler.addObserver(orderObserver2);
       order.statusChange("Shipped", observerHandler);

    }
}
