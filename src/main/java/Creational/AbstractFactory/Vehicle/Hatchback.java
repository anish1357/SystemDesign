package Creational.AbstractFactory.Vehicle;

public class Hatchback implements FourWheeler {
    @Override
    public void maxSpeed() {
        System.out.println("I have max spped of 150 kmph");
    }

}
