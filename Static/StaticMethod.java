package Static;

class Book {
    private String title;
    private double price;
    static String pub = "Test Publisher";

    public static void setPub(String p) {
        pub = p;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getInfo() {
        return "Title: " + title + ", Price: " + price + ", Publisher: " + pub;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Book.setPub("New Publisher");
        Book bk1 = new Book("Java", 89.9);
        Book bk2 = new Book("test", 69.9);

        System.out.println(bk1.getInfo());
        System.out.println(bk2.getInfo());
    }

}
