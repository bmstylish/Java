package AdvJava_OOP.Inheritance;

class Message {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }
}

class B extends Message {
    // This class has no methods
}

public class Inheritance_2 {
    public static void main(String[] args) {
        B b = new B();
        b.setMsg("Hello");
        System.out.println(b.getMsg());
    }
}
