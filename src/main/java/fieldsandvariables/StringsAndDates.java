package fieldsandvariables;

/**
 * @author Fatima Trtak
 */
public class StringsAndDates {


    public static void main(String[] args) {
        java.lang.String str = "Hello!";
        String str2 = "Hello!";
        System.out.println(str == str2);

        String str3 = new String("Hello!");
        System.out.println(str == str3);

        String str4 = 5 + 3 + "xyz" + 3 + 5;
        System.out.println(str4);
    }
}
