package Structural.Decorator;

public class Client {
    public static void main(String args[]){
        Pizza simpleVegPizza = new VegPizza();
        System.out.println(simpleVegPizza.getCost());
        Pizza simpleVegPizzaWithOnion = new ExtraOnion(new VegPizza());
        System.out.println(simpleVegPizzaWithOnion.getCost());
        Pizza simpleNonVegPizza = new NonVegPizza();
        System.out.println(simpleNonVegPizza.getCost());
        Pizza simpleNonVegPizzaWithCheeseAndOnion = new ExtraCheese(new ExtraOnion(simpleNonVegPizza));
        System.out.println(simpleNonVegPizzaWithCheeseAndOnion.getCost());
    }
}
