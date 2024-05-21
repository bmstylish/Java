package ErrorCatching;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Start Operations");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("End of Operations");
    }
}
