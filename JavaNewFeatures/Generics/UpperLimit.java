package JavaNewFeatures.Generics;

class Message<T extends Number> {
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }

    public T getMsg() {
        return this.msg;
    }
}

public class UpperLimit {
    public static void main(String[] args) {
        Message<Integer> msg = new Message<Integer>();
        msg.setMsg(10);
        fun(msg);
    }

    public static void fun(Message<? extends Number> temp) {
        System.out.println(temp.getMsg());
    }
}
