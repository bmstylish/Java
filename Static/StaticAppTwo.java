package Static;

class Book {
    private String title;
    private static int count = 0;

    public Book() {
        this("NOTITLE - " + count++);
    }

    public Book(String title) {
        this.title = title;
    }

    public String getInfo() {
        return this.title;
    }
}

public class StaticAppTwo {
    public static void main(String args[]) {
        System.out.println(new Book("Java").getInfo());
        System.out.println(new Book().getInfo());
        System.out.println(new Book().getInfo());
    }
}
