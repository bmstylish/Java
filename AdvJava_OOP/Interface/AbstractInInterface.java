package AdvJava_OOP.Interface;

interface A {
    public void print();

    abstract class B {
        public void fun() {
            System.out.println("Interface A Method");
        }
    }
}

class X implements A {
    public void print() {
        System.out.println("Interface A Method");
    }

    class C extends B {
        public void fun() {
            System.out.println("Interface B Method");
        }
    }
}

public class AbstractInInterface {
    public static void main(String[] args) {
        X x = new X();
        x.print();
        X.C c = x.new C();
        c.fun();
    }
}