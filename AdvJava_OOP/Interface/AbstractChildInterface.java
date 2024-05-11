package AdvJava_OOP.Interface;

interface A {
    public void print();
}

interface B {
    public void get();
}

abstract class C {
    public abstract void change();
}

class X extends C implements A, B {
    public void print() {
        System.out.println("Interface A Method");
    }

    public void get() {
        System.out.println("Interface B Method");
    }

    public void change() {
        System.out.println("Abstract C Method");
    }
}

public class AbstractChildInterface {
    public static void main(String[] args) {
        X x = new X(); // Instantiate Child
        A a = x; // Morph Up
        B b = x; // Morph Up
        C c = x; // Morph
        a.print();
        b.get();
        c.change();
    }
}
