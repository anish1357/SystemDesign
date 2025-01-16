package Structural.Decorator;

public class NonVegPizza implements Pizza{
    @Override
    public Integer getCost() {
        return 250;
    }
}
