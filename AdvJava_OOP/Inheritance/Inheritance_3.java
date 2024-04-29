package AdvJava_OOP.Inheritance;

class A {
    public A() {
        System.out.println("A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("B Constructor");
    }
}

public class Inheritance_3 {
    public static void main(String[] args) {
        new B();
    }
}
