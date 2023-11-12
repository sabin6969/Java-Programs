import java.util.Scanner;

public class OccuranceOfParticularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int targetNumber = sc.nextInt();
        System.out.print("Enter a number to be searched: ");
        int numberToBeSearched = sc.nextInt();
        int count = 0;
        sc.close();
        while (targetNumber != 0) {
            int unitDigit = targetNumber % 10;
            if (unitDigit == numberToBeSearched) {
                count += 1;
            }
            targetNumber = targetNumber / 10;
        }
        System.out.printf("Occurance of %d is %d", numberToBeSearched, count);
    }
}
