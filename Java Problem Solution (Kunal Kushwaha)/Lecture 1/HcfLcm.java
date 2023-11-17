import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers seperated by space: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a > b ? a : b;
        int hcf = 1;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
        sc.close();
    }
}
