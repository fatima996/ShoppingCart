package ordersSOLID;

/**
 * @author Fatima Trtak
 */
public abstract class Product {
    private String name;
    private int price;
    private int discount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        int shippingCost = calculateShippingCost();
        return (int) (price * (100 - discount) / 100.0) + shippingCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ordersSOLID.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract int calculateShippingCost();
}
