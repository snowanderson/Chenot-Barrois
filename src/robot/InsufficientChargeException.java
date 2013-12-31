package robot;

public class InsufficientChargeException extends Exception {
    public InsufficientChargeException()
    {
        super("La batterie est trop faible");
    }
}
