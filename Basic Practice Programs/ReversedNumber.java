import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int targetNumber = sc.nextInt();
        sc.close();
        int reversedNumber = 0;
        while (targetNumber > 0) {
            int unitDigit = targetNumber % 10;
            reversedNumber = reversedNumber * 10 + unitDigit;
            targetNumber = targetNumber / 10;
        }
        System.out.printf("Reversed %d", reversedNumber);
    }
}
