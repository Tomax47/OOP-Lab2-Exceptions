package Exception;

//NO USAGE DUE TO AN UNKNOWN ERROR!

public class NoYValue extends Exception{
    private double x;
    private String y;


    public NoYValue(){
        super();
    }

    public NoYValue(String message) {
        super(message);
    }

    public NoYValue(String message, double x, String y){
        super(message);
        this.x = x;
        this.y = y;
    }

    public String ignoreThePoint() {
        String message = " ";
        if (!y.isEmpty()) message = "Ignored empty-valued point!";
        return message;
    }
}
