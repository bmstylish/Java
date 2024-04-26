package Simple_Java_OOP.Array.Sort;

public class ObjectArray {
    public static void main(String[] args) {
        Book book[] = new Book[3]; // Dynamic Define
        book[0] = new Book("Java", 69.9);
        book[1] = new Book("Demo", 89.9);
        book[2] = new Book("Test", 109.9);
        for (int x = 0; x < book.length; x++) {
            System.out.println(book[x].getInfo());
        }

        Book book2[] = new Book[] { // Static Define
                new Book("Java", 69.9),
                new Book("Demo", 89.9),
                new Book("Test", 109.9) };
        for (int x = 0; x < book.length; x++) {
            System.out.println(book2[x].getInfo());
        }
    }
}

/**
 * Book
 */
class Book {
    private String title;
    private double price;

    public Book(String t, double p) {
        title = t;
        price = p;
    }

    public String getInfo() {
        return "Title: " + title + ", Price: " + price;
    }
}
