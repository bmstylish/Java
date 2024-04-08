public class ObjectThis {
    public static void main(String args[]) {
        Book bookA = new Book();
        System.out.println("BookA: " + bookA);
        bookA.getInfo();
        System.out.println("***************************");
        Book bookB = new Book();
        System.out.println("BookB: " + bookB);
        bookB.getInfo();
    }
}

class Book {
    public void getInfo() {
        System.out.println("this: " + this);
    }

}
