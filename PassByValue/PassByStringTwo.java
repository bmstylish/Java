package PassByValue;

public class PassByStringTwo {
    public static void main(String[] args) {
        Message msg = new Message("Nihao");
        fun(msg);
        System.out.println(msg.getString());
    }

    public static void fun(Message temp) {
        temp.setString("World");
    }
}

class Message {
    private String str = "Hello";

    public Message(String str) {
        this.str = str;
    }

    public void setString(String str) {
        this.str = str;
    }

    public String getString() {
        return this.str;
    }
}
