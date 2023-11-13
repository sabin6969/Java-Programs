import java.util.Scanner;

/**
 * NestedSwitchCaseStatement
 */
public class NestedSwitchCaseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a department name: ");
        String department = sc.next();
        switch (department) {
            case "computer":
                System.out.println("Enter a employee id: ");
                String employeeId = sc.next().trim();
                switch (employeeId) {
                    case "cs10":
                        System.out.println("Sabin Poudel");
                        break;
                    case "cs20":
                        System.out.println("Smith Bhattarai");
                        break;
                    default:
                        System.out.println("No user found for given id");
                        break;
                }
                break;
            case "electrical":
                System.out.println("Enter a employee id: ");
                String id = sc.next().trim();
                switch (id) {
                    case "e10":
                        System.out.println("Anil Poudel");
                        break;
                    case "e20":
                        System.out.println("Bipin Karki");
                        break;
                    default:
                        System.out.println("No user found for given id");
                        break;
                }
                break;
            default:
                System.out.println("Enter a valid department");
        }
        sc.close();
    }
}