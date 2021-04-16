package pl.adiks.springexceptionhandling.exception;

public class OrderServiceException extends Exception {

    private static final long serialVersionUID = 6945173806536847125L;

    public OrderServiceException(String message) {
        super(message);
    }
}
