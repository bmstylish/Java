package InnerClass;

class Outer {
    private String msg = "Hello";

    public void fun() {
        new Inner(this).print();
    }

    public String getMsg() {
        return this.msg;
    }
}

class Inner {
    private Outer outer; // Must have a reference to the outer class

    public Inner(Outer outer) {
        this.outer = outer;
    }

    public void print() {
        System.out.println(this.outer.getMsg());
    }
}

public class InnerclassTwo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
    }

}
