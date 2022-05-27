package ordersSOLID;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Fatima Trtak
 */
public class CreditCard implements PaymentMethod {

    public final long cardNumber;

    public CreditCard(long ccNumber) {
        this.cardNumber = ccNumber;
    }

    @Override
    public Optional<Payment> makePayment(int value) {
        if (Math.random() > 0.3) {
            return Optional.of(new Payment(this, UUID.randomUUID()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "ordersSOLID.CreditCard{" +
                "number=" + cardNumber +
                '}';
    }
}
