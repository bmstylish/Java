import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Numbers numbers = test.new Numbers();
        ArrayList<Integer> result = numbers.countDown(5, 10, 0);
        System.out.println(result);
    }

    class Numbers {
        public ArrayList<Integer> countDown(int min, int max) {
            return countDown(min, max, 1);
        }

        public ArrayList<Integer> countDown(int min, int max, int step) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            if (step <= 0) {
                return new ArrayList<Integer>();
            }
            for (int i = max; i >= min; i = i - step) {
                result.add(i);
                max = max - step;
                if (min < 0)
                    min = max;
            }
            return result;
        }
    }
}
