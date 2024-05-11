package AdvJava_OOP.Object;

class Book extends Object {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + ", Price: " + price;
    }
}

public class toStringOverwrite {
    public static void main(String[] args) {
        Object obj = new Book("Java", 89.9); // Morph Up
        Object obj2 = "Hello World"; // Morph Up

        System.out.println(obj);
    }
}
