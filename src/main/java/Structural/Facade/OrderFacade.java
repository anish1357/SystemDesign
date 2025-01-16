package Structural.Facade;

import java.util.List;

public class OrderFacade {
    public Cart cart;
    public PaymentGateway paymentGateway;
    public Notifier notifier;

    public OrderFacade(PaymentGateway paymentGateway, Cart cart, Notifier notifier) {
        this.paymentGateway = paymentGateway;
        this.cart = cart;
        this.notifier = notifier;
    }

    public void placeOrder(List<Item> items){
        items.forEach(item -> cart.addItem(item));
        paymentGateway.setItemList(items);
        paymentGateway.calculateTotalCost();
        paymentGateway.makePayment();
        notifier.notifyUsers();
    }
}
