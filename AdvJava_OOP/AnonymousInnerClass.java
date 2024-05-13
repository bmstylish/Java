package AdvJava_OOP;

interface Message {
    public void print();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        fun(
                new Message() { // Initialize interface object
                    public void print() { // Overwrite print method
                        System.out.println("Hello World");
                    }
                });
    }

    public static void fun(Message msg) {
        msg.print();
    }
}
