package Nodes;

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * Compare two books
     *
     * @param book the book to compare
     * @return true if the books have the same title, false otherwise
     */
    public boolean compare(Book book) {
        if (book == null) {
            return false;
        }

        if (this == book) {
            return true;
        }

        if (this.title.equals(book.title)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Set the title and price of this book
     *
     * @param title the title to set
     * @param price the price to set
     */
    public void set(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * Get the title of this book
     *
     * @return the title of this book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get the price of this book
     *
     * @return the price of this book
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Get a string with the title and price of this book
     *
     * @return a string with the title and price of this book
     */
    public String getInfo() {
        return "Title: " + title + ", Price: " + price;
    }
}

/**
 * The Link class represents a linked list data structure that stores Book
 * objects.
 * It provides methods to add, remove, get, set, check for containment, and
 * convert to an array.
 */
class Link {
    /************ ---------- Inner class Begins ---------- ***********/
    private class Node {
        private Book data;
        private Node next;

        public Node(Book data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        public boolean containsNode(Book data) {
            if (this.data.compare(data)) {
                return true;
            }
            if (this.next != null) {
                return this.next.containsNode(data);
            } else {
                return false;
            }
        }

        public Book getNode(int index) {
            if (Link.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, Book data) {
            if (Link.this.count++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        public void removeNode(Node previous, Book data) {
            if (data.compare(this.data)) {
                previous.next = next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }
    }

    /************ ---------- Inner class Ends ---------- ***********/
    private Node root;
    private int count = 0;
    private int foot = 0;
    private Book[] retArray;

    public void add(Book data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean contains(Book data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    public Book get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    public void set(int index, Book data) {
        if (index > this.count) {
            return;
        }
        this.root.setNode(index, data);
    }

    public void remove(Book data) {
        if (this.contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
            this.count--;
        }
    }

    public Book[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retArray = new Book[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    public void clear() {
        this.root = null;
        this.count = 0;
        this.foot = 0;
    }

}

public class NodeApp {
    public static void main(String[] args) {
        Link list = new Link();
        list.add(new Book("Java", 100.0));
        list.add(new Book("Python", 200.0));
        list.add(new Book("C++", 300.0));
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty: " + list.isEmpty());
        System.out.println(list.contains(new Book("Java", 100.0)));
        list.remove(new Book("C++", 300.0));
        Book[] books = list.toArray();
        for (int x = 0; x < books.length; x++) {
            System.out.println(books[x].getInfo());
        }
    }
}
