package exceptions;

// checked exception (is caught at compile time)
public class MadnessException extends Exception {
    public MadnessException(String message) {
        super(message);
    }
}
