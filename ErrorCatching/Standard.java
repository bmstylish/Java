package ErrorCatching;

class MyMaths {
    public static int div(int x, int y) throws Exception {
        System.out.println("Startl,. of Calculations");
        int result = 0;
        try {
            result = x / y;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("End of Calculations");
        }
        return result;
    }
}

public class Standard {
    public static void main(String[] args) {
        try {
            System.out.println(MyMaths.div(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
