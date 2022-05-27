package OOP;

import java.util.concurrent.ExecutorService;

import static java.lang.Math.random;
import static java.lang.Thread.sleep;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

/**
 * @author Fatima Trtak
 */
public class RadarTarget {
    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    public RadarTarget(String callSign, int flightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.model = model;
    }

    public RadarTarget(String callSign, int flightLevel, int requiredFlightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = requiredFlightLevel;
        this.model = model;
    }

    public String getLabel() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.callSign);
        sb.append(linearSeparator());

        sb.append(this.flightLevel)
                .append(this.getClimbDescendIndicator())
                .append(this.requiredFlightLevel);
        sb.append(linearSeparator());

        sb.append(model);

        return sb.toString();
    }

    private char linearSeparator() {
        return 0;
    }

    private String getClimbDescendIndicator() {
        if (this.requiredFlightLevel > this.flightLevel) {
            return "\uD83D\uDD3C";
        }
        if (this.requiredFlightLevel < this.flightLevel) {
            return "\uD83D\uDD3D";
        }
        return "=";
    }

    public void changeAltitude(int newFl) {
        System.out.println(this.callSign + " change altitude " + newFl);
        this.requiredFlightLevel = newFl;

        ExecutorService es = newSingleThreadExecutor();
        es.execute(() -> {
            try {
                sleep((long) (random() * 5 * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
        });
    }
}
