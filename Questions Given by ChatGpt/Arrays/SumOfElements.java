public class SumOfElements {
    static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 23, 34, 45, 56 };
        int sum = sumOfElements(numbers);
        System.out.println(sum);
    }
}