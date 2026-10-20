import java.util.concurrent.SubmissionPublisher;

public class SupportTicket {
    int severity;
    String message;
    SupportTicket(int severity, String message){
        this.message = message;
        this.severity = severity;
    }
}
