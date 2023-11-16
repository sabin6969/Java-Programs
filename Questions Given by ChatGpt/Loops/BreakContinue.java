// break is a keyword which is used to terminate the loop or sequence
// continue is a keyword which is used to skip the current iteration
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
