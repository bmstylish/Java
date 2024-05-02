package AdvJava_OOP.Polymorphism;

class A {
    public void fun() {
        System.out.println("Fun A");
    }
}

class B extends A {
    public void fun() {
        System.out.println("Fun B");
    }
}

public class Up {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}
