import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum is " + sum);
        sc.close();
    }
}
