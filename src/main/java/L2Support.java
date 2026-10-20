public class L2Support implements EscalationSupport{

    EscalationSupport nextHandler;
    @Override
    public void setNextHandler(EscalationSupport escalationSupport) {
        this.nextHandler=escalationSupport;
    }

    @Override
    public void handleEscalation(SupportTicket ticket) {
        if(ticket.severity<=2){
            System.out.print("L2Support will handle!!");
        }else{
            nextHandler.handleEscalation(ticket);
        }
    }
}
