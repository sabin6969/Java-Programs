public class AverageOfElements {

    static float average(int[] array) {
        float average = 0.0f;
        for (int i : array) {
            average += i;
        }
        return average / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 34, 45, 34, 12 };
        float average = average(numbers);
        System.out.printf("%.2f", average);
    }
}
