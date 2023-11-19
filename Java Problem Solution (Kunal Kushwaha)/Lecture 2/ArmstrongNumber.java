import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int power = String.valueOf(number).length();
        int sum = 0;
        while (number != 0) {
            int unitDigit = number % 10;
            sum = sum + (int) Math.pow(unitDigit, power);
            number = number / 10;
        }
        if (original == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
        sc.close();
    }
}
