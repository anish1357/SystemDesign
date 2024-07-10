package Creational.AbstractFactory.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{

    public TwoWheeler getVehicle(String s){
        switch(s){
            case "Bike":
                return new Bike();
            case "Scooty":
                return new Scooty();
            case "Yulu":
                return new Yulu();
            default:
                return null;
        }
    }

}
