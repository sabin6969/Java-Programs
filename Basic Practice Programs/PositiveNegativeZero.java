import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.printf("%d is Positive", a);
        } else if (a < 0) {
            System.out.printf("%d is negative", a);
        } else {
            System.out.printf("%d is equal to 0", a);
        }
        sc.close();

    }
}
