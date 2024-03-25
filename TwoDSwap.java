public class TwoDSwap {
    public static void main(String args[]) {
        int data[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print(data);
        reverse(data);
        print(data);

    }

    public static void reverse(int arr[][]) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x; y < arr[x].length; y++) {
                if (x != y) {
                    int temp = arr[x][y];
                    arr[x][y] = arr[y][x];
                    arr[y][x] = temp;
                }
            }
        }

    }

    public static void print(int temp[][]) {
        for (int x = 0; x < temp.length; x++) {
            for (int y = 0; y < temp[x].length; y++) {
                System.out.print(temp[x][y] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
