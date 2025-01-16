package Structural.Bridge;

public class BikeTravel implements TravelImplementor{
    @Override
    public void travel() {
        System.out.println("Travel by Bike");
    }
}
