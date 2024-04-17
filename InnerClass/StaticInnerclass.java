package InnerClass;

class Outer {
    private static String msg = "hello world";

    static class Inner {
        public void print() {
            System.out.println(Outer.msg);
        }
    }
}

public class StaticInnerclass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.print();
    }
}