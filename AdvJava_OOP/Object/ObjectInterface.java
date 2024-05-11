/**
 * The ObjectInterface class demonstrates the use of an interface A and its implementation in class B.
 * Class B extends Object and implements interface A, providing an implementation for the print method.
 * The main method creates an instance of B, assigns it to interface A, and then demonstrates calling
 * the print method and printing the object using the toString method.
 */
package AdvJava_OOP.Object;

interface A {
    public void print();
}

class B extends Object implements A {
    public void print() {
        System.out.println("Interface A Method");
    }

    public String toString() {
        return "Interface";
    }
}

public class ObjectInterface {
    public static void main(String[] args) {
        A a = new B(); // Initialized Interface Object
        Object obj = a; // Received Interface Object
        A t = (A) obj; // Morph Down
        t.print();
        System.out.println(t);
    }
}
