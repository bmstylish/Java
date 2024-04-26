package Simple_Java_OOP.String;

public class InitalCap {
    public static void main(String args[]) {
        String str = "hello";
        System.out.println(initalCap(str));
    }

    public static String initalCap(String temp) {
        return temp.substring(0, 1).toUpperCase() + temp.substring(1);
    }

}
