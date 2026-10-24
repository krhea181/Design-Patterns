public class ClientBase {
    public static void main(String[] args){
       Order order = new Order(101, "101 order is being made");
       ObserverHandler observerHandler = new ObserverHandler(order);
       OrderObserver orderObserver1 = new EmailNotification();
       OrderObserver orderObserver2 = new InventoryManage();
       observerHandler.updateObserver(orderObserver1);
       observerHandler.updateObserver(orderObserver2);
       order.StatusChange("Shipped", observerHandler);

    }
}
