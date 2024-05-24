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

public class Wildcard {
    public static void main(String[] args) {
        Message<String> msg = new Message<>();
        Message<Integer> msg1 = new Message<>();
        msg.setMsg("Hello");
        msg1.setMsg(1);
        fun(msg1);
        fun(msg);
    }

    public static void fun(Message<?> temp) {
        System.out.println(temp.getMsg());
    }
}
