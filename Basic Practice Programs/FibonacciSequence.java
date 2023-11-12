import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        sc.close();
        int a = 0, b = 1, i;
        int sum = a + b;
        System.out.printf("%d %d %d ", a, b, sum);
        for (i = 3; i < range; i++) {
            a = b;
            b = sum;
            sum = a + b;
            System.out.print(sum + " ");
        }

    }
}
