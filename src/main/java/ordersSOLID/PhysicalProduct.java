package ordersSOLID;

/**
 * @author Fatima Trtak
 */
public class PhysicalProduct extends Product {

    public int weight;

    public PhysicalProduct(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public int calculateShippingCost() {
        return weight * Catalogue.SHIPPING_RATE;
    }
}
