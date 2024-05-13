package AdvJava_OOP.WrapperClass;

public class DataConversion {
    public static void main(String[] args) {
        int num = 100;
        String toStr = String.valueOf(num); // Converted to String
        System.out.println(toStr.replaceAll("0", "9"));

        /****************************** *******************************/
        String str = "123";
        String test = "true";

        int temp = Integer.parseInt(str);
        double temp2 = Double.parseDouble(str);
        boolean temp3 = Boolean.parseBoolean(test);
        System.out.println(temp + " " + temp2 + " " + temp3);
    }
}
