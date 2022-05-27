package fieldsandvariables;

import java.util.Objects;

/**
 * @author Fatima Trtak
 */
public final class Volume {

    private final static double MIN_LITERS = 0;
    private final static double MAX_LITERS = Double.MAX_VALUE;

    public final double liters;

    public Volume(double liters) {
        if (liters <= MIN_LITERS) throw new NumberFormatException();
        this.liters = liters;
    }

    public double getLiters() {
        return liters;
    }

    public double inMilliliters(){
        return liters * 1000;
    }

    public double inQuarts(){
        return liters * 1.05669;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.liters, liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liters);
    }

    @Override
    public String toString() {
        return "Volume{" +
                "liters=" + liters +
                '}';
    }
}
