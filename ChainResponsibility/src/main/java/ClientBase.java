public class ClientBase {
    public static void main(String[] args){
        SupportTicket ticket = new SupportTicket(2, "It's response-3");
        EscalationSupport l1Support = new L1Support();
        EscalationSupport l2Support = new L2Support();
        EscalationSupport l3Support = new L3Support();
        l1Support.setNextHandler(l2Support);
        l2Support.setNextHandler(l3Support);
        l1Support.handleEscalation(ticket);
    }
}
