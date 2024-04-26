package Simple_Java_OOP.Array.Sort;

public class SortBySmallest {
    public static void main(String args[]) {
        int data[] = new int[] { 2, 1, 9, 0, 5, 3, 7, 6, 8 };
        System.out.print("PreOrder: ");
        print(data);
        sort(data);
    }

    public static void sort(int arr[]) {
        for (int x = 0; x < arr.length; x++) { // Controls the amount of sorts
            for (int y = 0; y < arr.length - 1; y++) { // Controls every sort
                if (arr[y] < arr[y + 1]) { // Decided whether to swap keys in array
                    int t = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = t;
                }
            }
        }
        System.out.print("Ordered: ");
        print(arr);
    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ", ");
        }
        System.out.println();
    }
}
