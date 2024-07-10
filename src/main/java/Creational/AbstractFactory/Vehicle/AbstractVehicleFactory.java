package Creational.AbstractFactory.Vehicle;

public class AbstractVehicleFactory {
    VehicleFactory getVehicleFactory(String s){
        switch (s){
            case "TwoWheeler":
                return new TwoWheelerFactory();
            case "FourWheeler":
                return new FourWheelerFactory();
            default:
                return null;
        }
    }
}
