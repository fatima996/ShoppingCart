package OOP.air.radar;

import OOP.air.geography.Coordinate;

/**
 * @author Fatima Trtak
 */
public class Aircraft {
    private String callSign;
    private Coordinate coordinate;
    private int altitudeFl;

    public Aircraft(String callSign, Coordinate coordinate, int altitudeFl) {
        this.callSign = callSign;
        this.coordinate = coordinate;
        this.altitudeFl = altitudeFl;
    }

    public String getCallSign() {
        return callSign;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public int getAltitudeFl() {
        return altitudeFl;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setAltitudeFl(int altitudeFl) {
        this.altitudeFl = altitudeFl;
    }
}
