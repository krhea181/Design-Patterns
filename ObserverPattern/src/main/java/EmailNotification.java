public class EmailNotification implements OrderObserver{

    @Override
    public void notifyStatusChange(Order order) {
        System.out.println("Email -> Order status update for order : "+order.getOrderId());
    }
}
