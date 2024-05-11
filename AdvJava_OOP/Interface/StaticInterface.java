package AdvJava_OOP.Interface;

interface A {
    public void print();

    static interface B {
        public void fun();
    }
}

class X implements A {
    public void print() {
        System.out.println("Interface A Method");
    }

    class Y implements B {
        public void fun() {
            System.out.println("Interface B Method");
        }
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        A.B a = new X().new Y();
        a.fun();
    }
}
