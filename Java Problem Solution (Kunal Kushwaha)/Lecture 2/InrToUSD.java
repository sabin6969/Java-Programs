import java.util.Scanner;

public class InrToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inr rupee: ");
        double inr = sc.nextDouble();
        double usdRate = 78.99;
        double usd = inr / usdRate;
        System.out.printf("%.2f", usd);
        sc.close();

    }
}
