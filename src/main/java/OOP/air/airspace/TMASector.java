package OOP.air.airspace;

import OOP.air.geography.Circle;
import OOP.air.geography.Coordinate;

import static OOP.air.geography.DistanceCalculator.*;

/**
 * @author Fatima Trtak
 */
public class TMASector implements AirSector {

    private Circle shape;
    private int upperAltitudeFl;


    public TMASector(Circle shape, int upperAltitudeFl) {
        this.shape = shape;
        this.upperAltitudeFl = upperAltitudeFl;
    }

    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if (altitude > this.upperAltitudeFl) {
            return false;
        }
        double distanceToRadius = calculate(x, this.shape.getOrigin());
        return distanceToRadius < this.shape.getRadiusNm();
    }
}
