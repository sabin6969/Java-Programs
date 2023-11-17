import java.util.Scanner;

public class TakingUserInputUntilX {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                sum += number;

            } catch (Exception e) {
                System.out.println("Bye");
                break;
            }
        }
        System.out.println("Sum is " + sum);
        sc.close();
    }
}
