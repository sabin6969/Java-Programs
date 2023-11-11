import java.util.Scanner;

public class VariablePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of a rectangle: ");
        float breadth = sc.nextFloat();
        float area = length * breadth;
        System.out.printf("Area of rectangle is %.2f", area);
        sc.close();

    }
}
