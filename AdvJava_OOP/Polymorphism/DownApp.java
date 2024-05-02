package AdvJava_OOP.Polymorphism;

/**
 * The DownApp class demonstrates method overriding and type casting in Java.
 * It contains classes A and B, where B extends A and overrides the fun()
 * method.
 * The main method creates an instance of B and calls the fun() method through
 * the fun() method in DownApp.
 * The fun() method in DownApp takes an object of type A, casts it to B, and
 * calls the funB() method.
 */

class A {
    public void fun() {
        System.out.println("Fun A");
    }
}

class B extends A {
    public void fun() {
        System.out.println("Fun B");
    }
""
    // New Method
    public void funB() {
        System.out.println("Extension of B");
    }
}

public class DownApp {
    public static void main(String[] args) {
        fun(new B());
    }

    public static void fun(A a) {
        a.fun();
        if (a instanceof B) {
            B b = (B) a; // Morph down
            b.funB();
        }
    }
}
