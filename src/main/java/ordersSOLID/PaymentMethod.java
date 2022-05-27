package ordersSOLID;

import java.util.Optional;

/**
 * @author Fatima Trtak
 */
public interface PaymentMethod {
    Optional<Payment> makePayment(int value);
}
