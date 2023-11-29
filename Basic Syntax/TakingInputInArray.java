import java.util.Arrays;
import java.util.Scanner;

public class TakingInputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i : marks) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(marks));

        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println();
        for (String i : names) {
            System.out.println(i);
        }
        sc.close();
    }
}
