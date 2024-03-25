public class SwappingEnds {
    public static void main(String args[]) {
        int data[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int temp[] = new int[data.length]; // Creates a blank array with the same datalength
        int foot = data.length - 1; // foot = 7, as data.length = 8
        print(data);

        for (int x = 0; x < temp.length; x++) {
            temp[x] = data[foot]; // temp[0] is the first, while data[7] is the last in the array
            foot--;
        }
        data = temp;
        print(data);
    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ", ");
        }
        System.out.println();
    }
}
