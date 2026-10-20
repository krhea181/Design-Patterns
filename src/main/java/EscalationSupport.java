public interface EscalationSupport {
   void setNextHandler(EscalationSupport escalationSupport);
   void handleEscalation(SupportTicket ticket);
}
