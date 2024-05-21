package ErrorCatching;

public class Throw {
    public static void main(String[] args) {
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
