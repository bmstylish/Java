package AdvJava_OOP.Object;

/**
 * The ObjectArray class demonstrates how to work with arrays stored in an
 * Object type variable.
 * It initializes an Object with an integer array, prints the object, and then
 * checks if the object is an instance of an int array.
 * If it is, it casts the object to an int array and prints each element of the
 * array.
 */
public class ObjectArray {
    public static void main(String[] args) {
        Object obj = new int[] { 1, 2, 3 };
        System.out.println(obj);
        if (obj instanceof int[]) {
            int arr[] = (int[]) obj;
            for (int x = 0; x < arr.length; x++) {
                System.out.println(arr[x]);
            }
        }
    }
}
