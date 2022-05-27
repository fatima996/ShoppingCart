package ordersSOLID;

/**
 * @author Fatima Trtak
 */
public class Demo {
    public static void main(String[] args) {

        char test = 65;
        System.out.println(test);
      /* Product toothbrush = Catalogue.getProduct("Electrical Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItems(new LineItem(toothbrush, 1));
        cart.addLineItems(new LineItem(babyAlarm, 1));
        cart.addLineItems(new LineItem(warAndPeace, 2));

        //ordersSOLID.Customer jhonDoe = new ordersSOLID.Customer("Jhon Doe", 12354684612487854L);

        int totalShippingCost = cart.getLineItems().stream()
                .mapToInt(LineItem::calculateShippingCost)
                .sum();
*/

     /*   ordersSOLID.Customer jhonDoe = new ordersSOLID.Customer(
                "Jhon Doe", 35635643612487854L);
        ordersSOLID.Customer acme = new ordersSOLID.BusinessCustomer(
                "Acme Products", 12354684612487854L, ordersSOLID.BusinessCustomer.BusinessSize.LARGE);

        ordersSOLID.Customer globex = new ordersSOLID.BusinessCustomer(
                "Globex Corp", 3423354463312487854L, ordersSOLID.BusinessCustomer.BusinessSize.LARGE);

        ordersSOLID.Customer saveTheWorld = new ordersSOLID.NonprofitCustomer(
                "Save the World", 234343453453453453L);

        List<ordersSOLID.Customer> customers = List.of(jhonDoe, acme, globex, saveTheWorld);

        Map<Integer, Long> discountMap = customers.stream()
                .collect(
                        Collectors.groupingBy(
                                ordersSOLID.Customer::calculateDiscount,
                                Collectors.counting())
                );
        System.out.println(discountMap);
        System.out.println(acme);*/
    }
}
