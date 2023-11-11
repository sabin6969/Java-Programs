import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int number = sc.nextInt();
        int fact = 1;
        if (number == 0) {
            System.out.printf("Factorial of  %d is %d", number, fact);
        } else if (number < 0) {
            System.out.println("Please enter a positive number");
        } else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.printf("Factorial of  %d is %d", number, fact);
        }

        sc.close();
    }
}
