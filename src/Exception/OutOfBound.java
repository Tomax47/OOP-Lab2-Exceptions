package Exception;

public class OutOfBound extends Exception{
    private int[] array;
    private int i;

    public OutOfBound(){
        super();
    }

    public OutOfBound(String message) {
        super(message);
    }

    public OutOfBound(String message, int[] array, int i) {
        super(message);
        this.array = array;
        this.i = i;
    }

    public String getMessage(){
        String message = " ";
        if (i > array.length) message = "Out of bound, no storing space is left in the array!";
        return message;
    }
}
