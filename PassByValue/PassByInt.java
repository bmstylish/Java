package PassByValue;

public class PassByInt {
    public static void main(String[] args) {
        Message msg = new Message(30);
        fun(msg);
        System.out.println(msg.getNum());
    }

    public static void fun(Message temp) { // temp==msg
        temp.setNum(100); // Thus pointing at the same heap storage
    }

}

class Message {
    private int num = 10;

    public Message(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

}