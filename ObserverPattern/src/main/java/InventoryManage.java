public class InventoryManage implements OrderObserver{

    @Override
    public void notifyStatusChange(Order order) {
        System.out.println("Inventory -> Order status update for order : "+order.getOrderId() );
    }
}
