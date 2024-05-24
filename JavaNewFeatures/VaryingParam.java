package JavaNewFeatures;

public class VaryingParam {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5));
        // Different Expressions but same output
        System.out.println(add(new int[] { 1, 2, 3, 4, 5 }));
    }

    public static int add(int... data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}
