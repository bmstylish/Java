package JavaNewFeatures.Generics;

class Message<T> {
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }

    public T getMsg() {
        return this.msg;
    }
}

public class LowerLimit {
    public static void main(String[] args) {
        Message<String> msg = new Message<String>();
        msg.setMsg("Test");
        fun(msg);
    }

    public static void fun(Message<? super String> temp) {
        System.out.println(temp.getMsg());
    }
}
