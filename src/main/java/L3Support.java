public class L3Support implements EscalationSupport{
    EscalationSupport nextHandler;
    @Override
    public void setNextHandler(EscalationSupport escalationSupport) {
        this.nextHandler=escalationSupport;
    }

    @Override
    public void handleEscalation(SupportTicket ticket) {
        if(ticket.severity>2){
            System.out.print("L3Support will handle!!");
        }else{
            System.out.print("This is out of scope!!");
        }
    }
}
