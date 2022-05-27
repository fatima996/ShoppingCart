package OOP.air.airspace;

import OOP.air.geography.Coordinate;
import OOP.air.geography.Rectangle;

/**
 * @author Fatima Trtak
 */
public class EnRouteSector implements AirSector {

    private int lowerAltitudeFl;
    private int upperAltitudeFl;
    private Rectangle shape;

    public EnRouteSector(Rectangle shape, int lowerAltitudeFl, int upperAltitudeFl) {
        this.lowerAltitudeFl = lowerAltitudeFl;
        this.upperAltitudeFl = upperAltitudeFl;
        this.shape = shape;
    }

    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if (altitude > this.upperAltitudeFl) {
            return false;
        }
        if (altitude < this.lowerAltitudeFl) {
            return false;
        }
        return shape.containsCoordinate(x);
    }
}
