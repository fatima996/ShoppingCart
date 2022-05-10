import java.util.Map;

/**
 * @author Fatima Trtak
 */
public class Catalogue {

    public final static int SHIPPING_RATE = 5;
    private static Map<String, Product> productMap = Map.of(
            "Electrical Toothbrush",
            new PhysicalProduct("Electrical Toothbrush",
                    3550,400),
            "Baby Alarm",
            new PhysicalProduct("Baby Alarm",
                    4999, 1000),
            "War and Peace",
            new DigitalProduct("War and Peace",
                    1550, ProductType.DIGITAL, -1)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
