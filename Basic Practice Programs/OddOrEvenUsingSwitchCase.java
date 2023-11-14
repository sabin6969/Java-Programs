import java.util.Scanner;

public class OddOrEvenUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = number % 2;
        switch (result) {
            case 0:
                System.out.printf("%d is Even", number);
                break;
            case 1:
                System.out.printf("%d is Odd", number);
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        sc.close();
    }
}