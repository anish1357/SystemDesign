package Creational.AbstractFactory.Vehicle;

public class Bike implements TwoWheeler{

    @Override
    public void maxSpeed() {
        System.out.println("I have max speed of 120 kmph");
    }
}
