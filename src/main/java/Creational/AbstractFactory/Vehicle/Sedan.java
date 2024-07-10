package Creational.AbstractFactory.Vehicle;

public class Sedan implements FourWheeler {

    @Override
    public void maxSpeed() {
        System.out.println("I have a maximum speed of 200 kmph");
    }

}
