public class MaximumElement {
    static int maximumElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 12, 23, 33, 101, 11 };
        int max = maximumElement(numbers);
        System.out.println(max);
    }
}
