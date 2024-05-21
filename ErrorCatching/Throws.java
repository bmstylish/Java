package ErrorCatching;

class MyMaths {
    public static int div(int x, int y) throws Exception {
        return x / y;
    }
}

public class Throws {
    public static void main(String[] args) {
        try { // Because MyMaths throws exception
              // Must be clear with exceptions
            System.out.println(MyMaths.div(10, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
