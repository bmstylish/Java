package InnerClass;

class Outer {
    private String msg = "Hello";

    class Inner {
        private String info = "World";

        public void print() {
            System.out.println(Outer.this.msg);
        }
    }

    public void fun() {
        Inner in = new Inner();
        System.out.println(in.info); // Access private methods of inner class
    }
}

public class InnerclassThree {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
    }
}
