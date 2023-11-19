import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remainder = number % 2;
        switch (remainder) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
            default:
                break;
        }
        sc.close();
    }
}