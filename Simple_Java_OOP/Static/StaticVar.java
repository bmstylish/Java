package Simple_Java_OOP.Static;

class Book {
    private String title;
    private double price;
    static String pub = "Test Publisher";

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getInfo() {
        return "Title: " + title + ", Price: " + price + ", Publisher: " + pub;
    }
}

public class StaticVar {
    public static void main(String[] args) {
        Book bk1 = new Book("Java", 89.9);
        Book bk2 = new Book("Test", 129.9);
        // Book.pub = "No Pub;"
        // Static field should be accessed in a static way
        bk1.pub = "No Pub";
        System.out.println(bk2.getInfo()); // Changing bk1, changed Pub of all Book class

    }

}
