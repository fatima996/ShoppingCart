package ordersSOLID;

/**
 * @author Fatima Trtak
 */
public class BusinessCustomer extends Customer {


    public enum BusinessSize {SMALL, MEDIUM, LARGE}

    public BusinessSize size;

    public BusinessCustomer(String name, BusinessSize size) {
        super(name);
        this.size = size;
    }


    @Override
    public int calculateDiscount() {
        switch (size) {
            case SMALL:
                return 5;
            case MEDIUM:
                return 10;
            case LARGE:
                return 20;
            default:
                throw new AssertionError("Unknown size type" + this);
        }
    }

    @Override
    public String toString() {
        return "ordersSOLID.BusinessCustomer{" +
                super.toString() +
                "size=" + size +
                '}';
    }
}