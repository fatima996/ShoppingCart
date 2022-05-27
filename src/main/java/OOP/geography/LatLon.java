package OOP.geography;

/**
 * @author Fatima Trtak
 */
public class LatLon {

    private double lat;
    private double lon;


    public LatLon(double lat, double lon) {
        this.setLat(lat);
        this.setLon(lon);
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        if (lat < -90 || lat > 90){
            throw new IllegalArgumentException("Value not valid!");
        }
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        if (lon < -180 || lon > 180){
            throw new IllegalArgumentException("Value not valid!");
        }
        this.lon = lon;
    }
}
