package OOP.air;

import OOP.air.airspace.AirSector;
import OOP.air.airspace.EnRouteSector;
import OOP.air.airspace.TMASector;
import OOP.air.geography.Circle;
import OOP.air.geography.Coordinate;
import OOP.air.geography.Rectangle;
import OOP.air.radar.Aircraft;

import java.util.List;

/**
 * @author Fatima Trtak
 */
public class Main {
    public static void main(String[] args) {

        List<AirSector> sectorsWithBadWeather = List.of(
                new TMASector(
                        new Circle(new Coordinate(20, 20), 10), 100),
                new EnRouteSector(
                        new Rectangle(
                                new Coordinate(0, 0),
                                new Coordinate(10, 20),
                                new Coordinate(0, 20),
                                new Coordinate(10, 0)),
                        200, 400));

        List<Aircraft> flyingAirCraft = List.of(
                new Aircraft("0S876", new Coordinate(20, 20), 50),
                new Aircraft("R0345", new Coordinate(5, 15), 200),
                new Aircraft("TA234", new Coordinate(30, 10), 230));

        sectorsWithBadWeather.forEach(s -> {
            flyingAirCraft.forEach(a -> {
                if (s.isInSector(a.getCoordinate(), a.getAltitudeFl())) {
                    System.out.println("Warning -> " + a.getCallSign() + "in bad weather sector.");
                }
            });
        });
    }


}
