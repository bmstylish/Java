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

public class Down {
    public static void main(String[] args) {
        A a = new B(); // Instantiate child object
        B b = (B) a; // Polymorphize down object
        b.fun();
    }
}
