import java.util.Scanner;

public class LinearSearch {

    static boolean isPresent(int[] array, int targetNumber) {
        for (int i : array) {
            if (i == targetNumber) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = { 12, 23, 44, 12, 33, 454 };
        int targetNumber = sc.nextInt();
        boolean result = isPresent(numbers, targetNumber);
        System.out.println(result);
        sc.close();

    }
}
