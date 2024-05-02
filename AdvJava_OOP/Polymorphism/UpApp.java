package AdvJava_OOP.Polymorphism;

/**
 * This program demonstrates polymorphism in Java by creating classes A, B, and
 * C
 * where B and C extend A and override the print method. The UpApp class
 * contains
 * the main method that calls the fun method with instances of B and C.
 * The fun method takes an object of type A and calls its print method,
 * demonstrating
 * polymorphic behavior where the actual method called is determined at runtime
 * based
 * on the type of object passed.
 */
class A {
    public void print() {
        System.out.println("Fun A");
    }
}

class B extends A {
    public void print() {
        System.out.println("Fun B");
    }
}

class C extends A {
    public void print() {
        System.out.println("Fun C");
    }
}

public class UpApp {
    public static void main(String[] args) {
        fun(new B());
        fun(new C());
    }

    public static void fun(A a) {
        a.print();
    }
}
