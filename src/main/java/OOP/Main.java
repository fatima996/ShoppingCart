package OOP;

/**
 * @author Fatima Trtak
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
     /*   FlightPlan berlinToBucharest = new FlightPlan(
                "BER", "OTP"
        );

        berlinToBucharest.toString();

        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 01, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );

        parisToLondon.print();*/

/*        RadarTarget os791 = new RadarTarget(
                "OS791",
                280,
                "B737-800"
        );
        System.out.println(os791.getLabel());

        os791.changeAltitude(200);

        for (int i = 0; i < 5; i++) {
            sleep(1000);
            System.out.println(os791.getLabel());

        }*/

        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFl = ConversionHelper.fromFeetToFL(300);
        System.out.println(altitudeInFeet + " ft -> FL " + altitudeInFl);

        double distInMeters = ConversionHelper.fromNmToMeters(10);
        System.out.println(distInNm + " Nm -> " + distInMeters + " m");

        Calculators.Distance d = new Calculators.Distance(1, 1, 3, 3);
        System.out.println("Distance is " + d.claculate());
    }
}
