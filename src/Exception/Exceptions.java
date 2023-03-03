package Exception;

public class Exceptions extends Exception {

    private double x;
    private int a;

    public Exceptions(){
        super();
    }

    public Exceptions(String message)  {
        super(message);
    }

    public Exceptions(String message, double x, int a) {
        super(message);
        this.x = x;
        this.a = a;
    }

    public String getMessage() {
        String message = " ";
        if (x == a) message = "Diving by zero is not possible";
        return message;
    }
}
