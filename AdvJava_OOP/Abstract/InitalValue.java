package AdvJava_OOP.Abstract;

/**
 * Abstract class A defines a blueprint for classes that extend it. It has a
 * constructor that calls the abstract method print().
 * Class B extends A and implements the print() method to print the value of the
 * private field num.
 * The main class InitalValue creates an instance of B with an initial value
 * passed to its constructor.
 */
abstract class A {
    public A() { // 2. Parent constructor
        this.print();
    }

    public abstract void print();// 3. Using print() method
}

class B extends A {
    private int num = 100;

    public B(int num) {
        this.num = num;
    }

    public void print() { // 4. Overwrite print() method
        System.out.println(this.num);
    }
}

public class InitalValue {
    public static void main(String[] args) {
        new B(30); // 1. Construct a new instance
    }
}
