package Simple_Java_OOP.String;

public class MultiSplit {
    public static void main(String[] args) {
        String str = "Jack:20|John:25|Dan:21";
        String result[] = str.split("\\|");
        for (int x = 0; x < result.length; x++) {
            String temp[] = result[x].split(":");
            System.out.println("Name: " + temp[0] + ", Age: " + temp[1]);
        }
    }

}
