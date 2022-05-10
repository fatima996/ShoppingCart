import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Fatima Trtak
 */
public class ShoppingCart {
    private List<LineItem> lineItems = new ArrayList<>();
    private int total;

    public void addLineItems(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems() {
        return lineItems.stream()
                .map(LineItem::new)
                .collect(Collectors.toList());
    }

    public int getTotal() {
        return total =
                lineItems.stream()
                        .mapToInt(LineItem::getPrice)
                        .sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "lineItems=" + lineItems +
                ", total=" + total +
                '}';
    }
}
