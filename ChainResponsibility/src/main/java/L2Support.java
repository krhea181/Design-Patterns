public class L2Support extends SupportHandler{

    @Override
    public void handleEscalation(SupportTicket ticket) {
        if(ticket.severity<=2){
            System.out.print("L2Support will handle!!");
        }else{
            nextHandler.handleEscalation(ticket);
        }
    }
}
