package OOP.air.geography;

import java.util.List;

/**
 * @author Fatima Trtak
 */
public class Rectangle {

    private List<Coordinate> coordinates;

    public Rectangle(Coordinate coordinate1,
                     Coordinate coordinate2,
                     Coordinate coordinate3,
                     Coordinate coordinate4) {

        if (coordinate1 == null || coordinate2 == null || coordinate3 == null || coordinate4 == null) {
            throw new IllegalArgumentException("Can not build rectangle!");
        }
        this.coordinates = List.of(coordinate1, coordinate2, coordinate3, coordinate4);
    }

    public boolean containsCoordinate(Coordinate c) {
        int maxX = coordinates.stream().mapToInt(Coordinate::getX).max().getAsInt();
        int minX = coordinates.stream().mapToInt(Coordinate::getX).min().getAsInt();
        int maxY = coordinates.stream().mapToInt(Coordinate::getY).max().getAsInt();
        int minY = coordinates.stream().mapToInt(Coordinate::getY).min().getAsInt();

        return c.getX() >= minX && c.getX() <= maxX && c.getY() >= minY && c.getY() <= maxY;
    }
}
