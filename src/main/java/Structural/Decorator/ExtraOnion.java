package Structural.Decorator;

public class ExtraOnion implements  Pizza{
    public Pizza pizza;

    public ExtraOnion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return this.pizza.getCost() + 20;
    }
}
