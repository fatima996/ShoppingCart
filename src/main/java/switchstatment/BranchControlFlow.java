package switchstatment;

/**
 * @author Fatima Trtak
 */
public class BranchControlFlow {
    public static void main(String[] args) {
//        String valueName= "one";
//        int total = 10;
//
//        switch (valueName){
//            case "one":
//                total += 1;
//                break;
//            case "two":
//                total += 2;
//                break;
//        }
//        System.out.println(total);

        int iVal = 9;
        final byte evenValue = 0;
        switch (iVal % 2){
            case evenValue:
                System.out.println("even");
                break;
            case evenValue + 1:
                System.out.println("odd");
                break;
        }
    }
}
