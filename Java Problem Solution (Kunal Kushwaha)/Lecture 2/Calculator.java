import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (ch == '+') {
            System.out.println(number1 + number2);
        } else if (ch == '-') {
            System.out.println(number1 - number2);
        } else if (ch == '*') {
            System.out.println(number1 * number2);
        } else if (ch == '/') {
            System.out.println(number1 / number2);
        } else {
            System.out.println("Invalid operation ");
        }
        sc.close();
    }
}
