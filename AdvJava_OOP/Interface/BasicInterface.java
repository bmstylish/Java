package AdvJava_OOP.Interface;

interface A {
    public void print();
}

interface B {
    public void get();
}

class X implements A, B {
    public void print() {
        System.out.println("Interface A Method");
    }

    public void get() {
        System.out.println("Interface B Method");
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        X x = new X(); // Instantiate Child
        A a = x; // Morph Up
        B b = x; // Morph Up
        a.print();
        b.get();
    }
}
