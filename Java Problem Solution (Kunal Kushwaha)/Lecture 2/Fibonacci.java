import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int sum = a + b;
        System.out.print("Enter the range of number: ");
        int range = sc.nextInt();
        System.out.printf("%d, %d, %d, ", a, b, sum);
        for (int i = 3; i <= range; i++) {
            a = b;
            b = sum;
            sum = a + b;
            System.out.printf("%d, ", sum);
        }
        sc.close();
    }
}
