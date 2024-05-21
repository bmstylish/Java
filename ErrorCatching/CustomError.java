package ErrorCatching;

class AddException extends Exception {
    public AddException(String msg) {
        super(msg);
    }
}

public class CustomError {
    public static void main(String[] args) {
        int num = 20;
        try {
            if (num > 10) {
                throw new AddException("Number is greater than 10");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
