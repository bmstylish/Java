package AdvJava_OOP.Abstract;

abstract class A {
    // Inner Static Abstract class
    abstract static class TestDemo {
        public abstract void write();
    }

    // Inner Abstract class
    abstract class Test {
        public abstract void write();
    }

    public void fun() {
        System.out.println("Fun A");
    }

    public abstract void print();

    // Static Methods
    public static void staticMethod() {
        System.out.println("Fun Static A");
    }
}

class B extends A {
    // Overwrite abstract class
    public void print() {
        System.out.println("Fun B");
    }

    // Overwrites inner abstract class
    class X extends Test {
        public void write() {
            System.out.println("Fun X");
        }
    }
}

// Static Abstract Class
class Y extends A.TestDemo {
    public void write() {
        System.out.println("Fun Y");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Static method in abstract
        A.staticMethod();

        A a = new B();
        a.print();

        // Instantiation by morphing up
        A.Test demo = new B().new X();
        demo.write();

        // Instantiation of Inner Class
        B.X b = new B().new X();
        b.write();

        // Instantiation by morphing up
        A.TestDemo ab = new Y();
        ab.write();
    }
}
