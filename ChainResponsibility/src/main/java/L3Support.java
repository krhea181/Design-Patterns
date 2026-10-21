public class L3Support extends SupportHandler{

    @Override
    public void handleEscalation(SupportTicket ticket) {
        if(ticket.severity>2){
            System.out.print("L3Support will handle!!");
        }else{
            System.out.print("This is out of scope!!");
        }
    }
}
