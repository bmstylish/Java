package AdvJava_OOP.Abstract;

abstract class A {
    public abstract void print();

    private static class B extends A {
        public void print() {
            System.out.println("Hello");
        }
    }

    public static A getinstance() {
        return new B();
    }
}

public class ghostChild {
    public static void main(String[] args) {
        A test = A.getinstance();
        test.print();
    }
}
