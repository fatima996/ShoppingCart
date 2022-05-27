package ordersSOLID;

/**
 * @author Fatima Trtak
 */
public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product,
                    int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public LineItem(LineItem lineItem) {
        this(lineItem.product, lineItem.quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "ordersSOLID.LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public  int calculateShippingCost() {
        return product.calculateShippingCost() * quantity;
    }
}
