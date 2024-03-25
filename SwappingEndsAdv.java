public class SwappingEndsAdv {
    public static void main(String arg[]) {
        int data[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        print(data);
        reverse(data);
        print(data);
    }

    public static void reverse(int arr[]) {
        int len = arr.length / 2;
        int head = 0;
        int tail = arr.length - 1;

        for (int x = 0; x < len; x++) {
            int temp = arr[head];
            arr[head] = arr[tail];
            arr[tail] = temp;
            head++;
            tail--;
        }
    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ", ");
        }
        System.out.println();
    }
}
