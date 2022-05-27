/**
 * @author Fatima Trtak
 */
public class Looping {
    public static void main(String[] args) {
        //while
        int someValue = 1;
        int factorial = 1;

        while (someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);


        //do-while

        int iVal = 5;
        do {
            System.out.println(iVal + " * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);


        //for loop
        int[] is = {1, 5, 6};
        int[] js = {7, 8, 9};
        int result = 0;
        for (int i = 0, j = js.length - 1; i < 3; i++, j--) {
            result = is[i] + js[j];
            System.out.println(result);
        }
    }

}
