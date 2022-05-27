package OOP.air.airspace;

import OOP.air.geography.Coordinate;

/**
 * @author Fatima Trtak
 */
public interface AirSector {
    boolean isInSector(Coordinate x, int altitude);

}
