package InnerClass;

class Outer {
    private String msg = "Hello";

    public void fun(int num) {
        double score = 99.9;
        class Inner {
            public void print() {
                System.out.println("Msg: " + Outer.this.msg);
                System.out.println("Method var:" + num);
                System.out.println("Method Param" + score);
            }
        }
        new Inner().print();
    }
}

public class InnerClassFive {
    public static void main(String[] args) {
        new Outer().fun(100);
    }
}
