package rocketseat.com.passin.domain.event.exceptions;

public class EventIsFullException extends RuntimeException {
    public EventIsFullException(String message) {
        super(message);
    }
}
