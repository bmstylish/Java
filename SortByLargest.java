public class SortByLargest {
    public static void main(String args[]) {
        int data[] = new int[] { 2, 1, 9, 0, 5, 3, 7, 6, 8 };
        System.out.print("PreOrder: ");
        print(data);
        sort(data);

        // for (int x = 0; x < data.length; x++) {
        // for (int y = 0; y < data.length - 1; y++) {
        // if (data[y] > data[y + 1]) {
        // int t = data[y];
        // data[y] = data[y + 1];
        // data[y + 1] = t;
        // }
        // }
        // }
        // System.out.print("Ordered: ");
        // print(data);
    }

    public static void sort(int arr[]) {
        for (int x = 0; x < arr.length; x++) { // Controls the amount of sorts
            for (int y = 0; y < arr.length - 1; y++) { // Controls every sort
                if (arr[y] > arr[y + 1]) { // Decided whether to swap keys in array
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