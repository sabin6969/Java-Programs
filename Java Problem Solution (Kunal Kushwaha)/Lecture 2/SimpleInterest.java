import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p, t, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        p = sc.nextFloat();
        System.out.print("Enter the rate: ");
        r = sc.nextFloat();
        System.out.print("Enter the time: ");
        t = sc.nextFloat();
        float si = (p * t * r) / 100;
        System.out.println("Simple interest is " + si);
        sc.close();
    }
}
