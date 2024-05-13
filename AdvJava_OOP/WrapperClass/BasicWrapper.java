package AdvJava_OOP.WrapperClass;

class MyInt {
    private int num; // basic data type
    /*
     * Wrapper class is for basic data types, so the constructor should
     * always have a parameter
     * 
     * @param num
     */

    public MyInt(int num) { // turning basic into wrapper type
        this.num = num;
    }

    public int intValue() { // returning wrapper type
        return this.num;
    }
}

public class BasicWrapper {
    public static void main(String[] args) {
        MyInt mi = new MyInt(10); // make int a class
        int temp = mi.intValue(); // take the wrapper type out from object
        System.out.println(temp * 2); // only taking our the wrapper then we can calculate
    }
}
