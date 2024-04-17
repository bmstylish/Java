package InnerClass;

class Outer {
    private String msg = "Hello";

    public void fun() {
        class Inner {
            public void print() {
                System.out.println(Outer.this.msg);
            }
        }
        new Inner().print();
    }
}

public class InnerclassMethod {
    public static void main(String[] args) {
        new Outer().fun();
    }
}
