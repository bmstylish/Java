package ErrorCatching;

public class Assert {
    public static void main(String[] args) {
        int num = 10;
        // Some function that makes num value 20
        assert num == 20 : "Number is not 10";
        System.out.println(num);
    }
}
