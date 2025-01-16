package Structural.Bridge;

public class CabTravel implements TravelImplementor{
    @Override
    public void travel() {
        System.out.println("Travel by Cab");
    }
}
