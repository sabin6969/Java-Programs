public class MinimumElement {

    static int minimumElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 2341, 11 };
        int min = minimumElement(numbers);
        System.out.println(min);
    }
}
