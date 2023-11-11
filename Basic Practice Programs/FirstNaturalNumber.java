import java.util.Scanner;

public class FirstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number: ");
        int range = sc.nextInt();
        sc.close();
        for (int i = 1; i <= range; i++) {
            System.out.printf("%d ", i);
        }
    }
}
