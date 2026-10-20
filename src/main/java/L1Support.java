public class L1Support implements EscalationSupport{

    EscalationSupport nextHandler;
    @Override
    public void setNextHandler(EscalationSupport escalationSupport) {
        this.nextHandler=escalationSupport;
    }

    @Override
    public void handleEscalation(SupportTicket ticket) {
        if(ticket.severity<=1){
            System.out.print("L1Support will handle this!!");
        }else {
            nextHandler.handleEscalation(ticket);
        }
    }
}
