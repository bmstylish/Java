package Simple_Java_OOP.PassByValue;

//This is a failed example
public class PassbyString {
    public static void main(String[] args) {
        String msg = "Hello";
        fun(msg);
        System.out.println(msg);
    }

    public static void fun(String temp) {
        temp = "World";
    }

}
