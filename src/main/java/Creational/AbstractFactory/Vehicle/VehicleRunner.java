package Creational.AbstractFactory.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        AbstractVehicleFactory avf1 = new AbstractVehicleFactory();
        VehicleFactory vf1 = avf1.getVehicleFactory("TwoWheeler");
        VehicleFactory vf2 = avf1.getVehicleFactory("FourWheeler");
        vf1.getVehicle("Bike").maxSpeed();
        vf1.getVehicle("Yulu").maxSpeed();
        vf2.getVehicle("SUV").maxSpeed();
        vf2.getVehicle("Sedan").maxSpeed();
    }
}
