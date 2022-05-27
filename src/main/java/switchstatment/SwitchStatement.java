package switchstatment;

/**
 * @author Fatima Trtak
 */
public class SwitchStatement {
    public static void main(String[] args) {
        char sign = '*';
        switch (sign) {
            case '+':
                System.out.println("Positive");
                break;
            case '-':
                System.out.println("Negative");
                break;
            default:
                System.out.println("Sign not recognized");
                break;
        }
    }
}
