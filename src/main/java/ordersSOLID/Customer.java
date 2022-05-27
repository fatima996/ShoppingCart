package ordersSOLID;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Fatima Trtak
 */
public class Customer {

    private final String name;
    private Map<String, PaymentMethod> paymentMethods = new HashMap<>();


    public Customer(String name) {
        this.name = name;
    }

    public void addPaymentMethod(String nickname, PaymentMethod paymentMethod) {
        paymentMethods.put(nickname, paymentMethod);
    }

    public int calculateDiscount() {
        return 0;
    }

    public Optional<Order> checkout(ShoppingCart shoppingCart, String paymentNickname) {
        Optional<PaymentMethod> paymentMethod =
                Optional.ofNullable(paymentMethods.get(paymentNickname));
        Optional<Payment> payment = paymentMethod
                .flatMap(pm -> pm.makePayment(shoppingCart.getTotal()));
        return payment.map(value -> new Order(this, shoppingCart, value));
    }

    @Override
    public String toString() {
        return "ordersSOLID.Customer{" +
                "name='" + name + '\'' +
                ", paymentMethods=" + paymentMethods +
                '}';
    }
}
