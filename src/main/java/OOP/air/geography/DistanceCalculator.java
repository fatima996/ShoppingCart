package OOP.air.geography;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @author Fatima Trtak
 */
public interface DistanceCalculator {

    static double calculate(Coordinate c1, Coordinate c2){
        return sqrt(
                pow((c1.getX() -c2.getX()), 2) +
                pow((c1.getY() - c2.getY()), 2));
    }
}
