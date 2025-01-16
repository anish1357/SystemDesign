package Structural.Bridge;

public class AutoTravel implements TravelImplementor{
    @Override
    public void travel() {
        System.out.println("Travel by Auto");
    }
}
