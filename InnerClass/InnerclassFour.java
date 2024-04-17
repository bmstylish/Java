package InnerClass;

class Outer {
    private String msg = "Hello";

    class Inner {
        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
}

public class InnerclassFour {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner(); // Insantiate the inner class
        in.print();
    }
}
