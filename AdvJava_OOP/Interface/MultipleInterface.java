package AdvJava_OOP.Interface;

interface A {
    public void print();
}

interface B {
    public void get();
}

interface C extends A, B {
    public void set();
}

class X implements C {
    public void print() {
        System.out.println("Interface A Method");
    }

    public void get() {
        System.out.println("Interface B Method");
    }

    public void set() {
        System.out.println("Interface C Method");
    }
}

public class MultipleInterface {

}
