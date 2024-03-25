
// checked -> Exception
// unChecked -> RuntimeException
public class InvalidAmountException extends Exception{

    public InvalidAmountException() {
        super("Invalid Amount");
    }
    public InvalidAmountException(String message) {
        super(message);
    }
}
