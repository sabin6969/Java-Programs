
// Ternary operator is a short hand syntax to write simple if else statement.
// syntax goes like this
// condition?true:false;
// wtf
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        boolean isEven = number % 2 == 0 ? true : false;
        String oddOrEven = isEven ? "Even number" : "Odd number";
        System.out.println(oddOrEven);

    }
}
