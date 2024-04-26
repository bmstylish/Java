package Simple_Java_OOP.Array.Sort;

public class SortUtilTwo {
    public static void main(String[] args) {
        int data[] = new int[] { 3, 6, 1, 2, 8, 0 };
        java.util.Arrays.sort(data); // Sorts smallest to biggest
        print(data);

    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ", ");
        }
        System.out.println();
    }
}
