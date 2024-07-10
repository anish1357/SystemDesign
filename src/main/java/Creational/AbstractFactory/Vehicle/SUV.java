package Creational.AbstractFactory.Vehicle;

public class SUV implements FourWheeler {
    @Override
    public void maxSpeed() {
        System.out.println("I have a maximum speed of 130 kmph");
    }

}
