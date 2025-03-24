package exceptions;

public class EmptyLibraryException extends RuntimeException {
    public EmptyLibraryException(String message) {
        super(message);
    }
}
