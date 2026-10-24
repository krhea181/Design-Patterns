public class EmailNotification implements OrderObserver{
    @Override
    public void notifyStatusChange() {
        System.out.print("Email notification changes done!!");
    }
}
