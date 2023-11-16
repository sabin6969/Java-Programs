import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers seperated by space:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.printf("%d is greatest", a);
        } else if (b > a && b > c) {
            System.out.printf("%d is greatest", b);
        } else {
            System.out.printf("%d is greatest", c);
        }
    }
}
