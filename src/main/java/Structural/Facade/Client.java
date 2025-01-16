package Structural.Facade;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
         Item item = new Item("FIFA 2024", "latest fifa game",1000.0);
        Item item2 = new Item("Cricket 2024", "latest cricket game",800.0);

//         Cart cart = new Cart();
//         cart.addItem(item);
//         PaymentGateway paymentGateway = new PaymentGateway(Arrays.asList(item));
//         paymentGateway.calculateTotalCost();
//         paymentGateway.makePayment();
//         Notifier notifier = new Notifier();
//         notifier.notifyUsers();
        OrderFacade orderFacade = new OrderFacade(new PaymentGateway(),new Cart(),new Notifier());
        orderFacade.placeOrder(Arrays.asList(item,item2));
    }

}
