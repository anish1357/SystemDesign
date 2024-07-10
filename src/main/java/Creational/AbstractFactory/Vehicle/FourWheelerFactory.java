package Creational.AbstractFactory.Vehicle;

public class FourWheelerFactory implements VehicleFactory{

    public FourWheeler getVehicle(String s){
        switch (s){
            case "SUV":
                return new SUV();
            case "Hatchback":
                return new Hatchback();
            case "Sedan":
                return new Sedan();
            default:
                return null;
        }
    }
}
