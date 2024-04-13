package Static;

class Book {
    private static int count = 0;

    Book() {
        count++;
        System.out.println(count);
    }
}

public class StaticApp {
    public static void main(String args[]) {
        new Book();
        new Book();
        new Book();
        new Book();
        new Book();
        new Book();
    }
}
