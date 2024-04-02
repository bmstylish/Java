public class SortUtil {
    public static void main(String args[]) {
        int dataA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int dataB[] = new int[] { 11, 22, 33, 44, 55, 66, 77, 88 };
        System.arraycopy(dataA, 4, dataB, 2, 3); // Copy 3 sets of data from key 4 from dataA to key 3 in dataB
        print(dataB);
    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ", ");
        }
        System.out.println();
    }
}
