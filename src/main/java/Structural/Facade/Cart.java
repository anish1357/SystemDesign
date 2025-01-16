package Structural.Facade;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Item> itemList;
    public Cart(){
        itemList = new ArrayList<>();
    }
    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }
}
