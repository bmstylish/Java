package Simple_Java_OOP.Object;

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public boolean toCompare(Book book) {
        if (book == null) {
            return false;
        } // checks if the address is the same
        if (this == book) { // this meaning, the class book
            return true; // with book being the var
        }
        if (this.title == book.title // checks of values of the object
                && this.price == book.price) {
            return true;
        } else {
            return false;
        }

    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

}

public class ObjectComparsion {
    public static void main(String[] args) {
        Book b1 = new Book("Java", 89.9);
        Book b2 = new Book("Java", 89.9);
        System.out.println(b1.toCompare(b2));
    }

}
