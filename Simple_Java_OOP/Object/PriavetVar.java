package Simple_Java_OOP.Object;

class Info {
    private String msg = "Hello";

    public void print() {
        System.out.println("msg: " + msg);
    }

    public void fun(Info temp, String msg) {
        temp.msg = msg;
    }
}

public class PriavetVar {
    public static void main(String[] args) {
        Info test = new Info();
        test.print();
        test.fun(test, "Test");
        test.print();
    }
}
