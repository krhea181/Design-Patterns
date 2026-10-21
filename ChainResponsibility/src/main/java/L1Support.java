public class L1Support extends SupportHandler{

    @Override
    public void handleEscalation(SupportTicket ticket) {
        if(ticket.severity<=1){
            System.out.print("L1Support will handle this!!");
        }else {
            nextHandler.handleEscalation(ticket);
        }
    }
}
