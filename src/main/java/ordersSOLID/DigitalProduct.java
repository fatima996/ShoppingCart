package ordersSOLID;

/**
 * @author Fatima Trtak
 */
public class DigitalProduct extends Product {
    public DigitalProduct(String name, int price, ProductType productType, int weight) {
        super(name, price);
    }

    @Override
    public int calculateShippingCost() {
        return 0;
    }
}
