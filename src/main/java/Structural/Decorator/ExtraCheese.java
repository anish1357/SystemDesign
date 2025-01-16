package Structural.Decorator;

public class ExtraCheese implements Pizza{

    public Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return this.pizza.getCost() + 30 ;
    }
}
