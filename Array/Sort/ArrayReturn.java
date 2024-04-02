public class ArrayReturn {

    public static void main(String[] args) {
        int data[] = init();
        print(data);
        System.out.println("Length of Array: " + init().length);
        System.out.println("Length of Array: " + data.length);
    }

    public static int[] init() {
        return new int[] { 1, 2, 3 };
    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ", ");
        }
        System.out.println();
    }

}