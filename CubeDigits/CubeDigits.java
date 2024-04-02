public class CubeDigits {
    public static void main(String[] args) {
        for (int num = 100; num <= 1000; num++) {
            if (isCubeDigitNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isCubeDigitNumber(int num) {
        int originalNum = num;
        int sumOfCubes = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfCubes += (digit * digit * digit);
            num /= 10;
        }

        return sumOfCubes == originalNum;
    }
}