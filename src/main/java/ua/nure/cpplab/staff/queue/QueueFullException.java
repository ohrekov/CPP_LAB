package ua.nure.cpplab.staff.queue;


public class QueueFullException extends RuntimeException {
    public QueueFullException(String message) {
        super(message);
    }
}
