import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d = %d\n", number, i, (number * i));
        }
    }
}
