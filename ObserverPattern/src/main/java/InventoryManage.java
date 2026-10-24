public class InventoryManage implements OrderObserver{
    @Override
    public void notifyStatusChange() {
        System.out.print("Notification status changes done!!");
    }
}
