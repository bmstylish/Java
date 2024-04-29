package AdvJava_OOP.Inheritance;

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

class C extends A {
    public void fun() {
        System.out.println("Fun C");
    }
}

public class MethodOverwrite {
    public static void main(String[] args) {
        B b = new B();
        b.fun();
        C c = new C();
        c.fun();
        b.fun();
    }
}
