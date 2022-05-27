package fieldsandvariables;

/**
 * @author Fatima Trtak
 */
public class Variables {

    public static void main(String[] args) {
        byte xByte = 5;
        byte yByte = 3;


/*    byte byteResult = xByte + yByte;
     byteResult = (int)xByte +(int)yByte;*/

        int intOne = 5;
        int result = ++intOne + intOne + ++intOne; // 19
        //               6         6          7
        intOne = 1;
        result = intOne++ + intOne + intOne++; // 5
        //           1         2          2

        int x = 2, y, k = 1;
        int z = x + (y = x + k);
        System.out.println(z);

        Integer intWrapper = new Integer(7);
        byte byteVal = intWrapper.byteValue();
        short shortVal = intWrapper.shortValue();
        int intVal = intWrapper.intValue();
        long longVal = intWrapper.longValue();
        float floatVal = intWrapper.floatValue();
        double doubleVal = intWrapper.doubleValue();

        intWrapper = new Integer(200_000);
        shortVal = intWrapper.shortValue();  //3.14

        Double dblWrapper = new Double(3.14);
        byteVal = dblWrapper.byteValue(); //3
    }

}
