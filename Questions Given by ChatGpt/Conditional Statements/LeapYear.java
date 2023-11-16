import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        short year = sc.nextShort();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Year is leap year");
        } else {
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
