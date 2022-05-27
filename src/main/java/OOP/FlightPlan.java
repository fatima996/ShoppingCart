package OOP;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author Fatima Trtak
 */
public class FlightPlan {
    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

    private FlightPlan() {
        System.out.println("FlightPlan()");
        this.id = UUID.randomUUID().toString();
    }

    public FlightPlan(String departure, String destination) {
        this();
        if (departure == null || destination == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("FlightPlan( %s, %s)", departure, destination));
        this.departure = departure;
        this.destination = destination;
    }

    public FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {
        this(departure, destination);

        if (departureTime == null || route == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("FlightPlan( %s, %s, %s, %s)",
                departure,
                destination,
                departureTime.toLocalTime(),
                route.toString()));

        this.departureTime = departureTime;
        this.route = route;
    }

    public void print() {
        System.out.println("FlightPlan{" +
                "id='" + id + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", route=" + route +
                '}');
    }
}
