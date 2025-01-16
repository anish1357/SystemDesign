package Structural.Facade;

import java.util.ArrayList;
import java.util.List;

public class PaymentGateway {
    List<Item> itemList ;

    public List<Item> getItemList() {
        return itemList;
    }

    public PaymentGateway() {
        itemList = new ArrayList<>();
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    Double calculateTotalCost(){
        return itemList.stream().mapToDouble(Item::getPrice).sum();
    }

    void makePayment(){
        System.out.println("Payment Received of amount : "  + this.calculateTotalCost());
    }
}
