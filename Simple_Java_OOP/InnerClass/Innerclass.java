package Simple_Java_OOP.InnerClass;

class Outer {
    private String msg = "Hello";

    class Inner {
        public void print() {
            System.out.println(msg);
        }
    }

    public void fun() {
        new Inner().print();
    }

}

public class Innerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
    }
}
