

/**
 * @author Fatima Trtak
 */
public class Demo {
    public static void main(String[] args) {

       Product toothbrush = Catalogue.getProduct("Electrical Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItems(new LineItem(toothbrush, 1));
        cart.addLineItems(new LineItem(babyAlarm, 1));
        cart.addLineItems(new LineItem(warAndPeace, 2));

        //Customer jhonDoe = new Customer("Jhon Doe", 12354684612487854L);

        int totalShippingCost = cart.getLineItems().stream()
                .mapToInt(LineItem::calculateShippingCost)
                .sum();


     /*   Customer jhonDoe = new Customer(
                "Jhon Doe", 35635643612487854L);
        Customer acme = new BusinessCustomer(
                "Acme Products", 12354684612487854L, BusinessCustomer.BusinessSize.LARGE);

        Customer globex = new BusinessCustomer(
                "Globex Corp", 3423354463312487854L, BusinessCustomer.BusinessSize.LARGE);

        Customer saveTheWorld = new NonprofitCustomer(
                "Save the World", 234343453453453453L);

        List<Customer> customers = List.of(jhonDoe, acme, globex, saveTheWorld);

        Map<Integer, Long> discountMap = customers.stream()
                .collect(
                        Collectors.groupingBy(
                                Customer::calculateDiscount,
                                Collectors.counting())
                );
        System.out.println(discountMap);
        System.out.println(acme);*/
    }
}
