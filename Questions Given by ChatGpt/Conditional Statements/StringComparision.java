import java.util.Scanner;

// equals method checks for value
// == checks for refrence only
public class StringComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Both strings are same");
        } else {
            System.out.println("They are different");
        }
        sc.close();
    }
}
