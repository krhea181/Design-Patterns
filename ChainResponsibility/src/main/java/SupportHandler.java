public abstract class SupportHandler implements EscalationSupport {
    EscalationSupport nextHandler;
    @Override
    public void setNextHandler(EscalationSupport escalationSupport){
        this.nextHandler=escalationSupport;
    }
}
