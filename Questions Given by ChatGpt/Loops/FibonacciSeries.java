import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int a = 0, b = 1;
        int sum = a + b;
        System.out.printf("%d, %d , %d, ", a, b, sum);
        for (int i = 3; i <= range; i++) {
            a = b;
            b = sum;
            sum = a + b;
            if (i == range) {
                System.out.printf("%d ", sum);
            } else {
                System.out.printf("%d, ", sum);
            }
        }
        sc.close();
    }
}
