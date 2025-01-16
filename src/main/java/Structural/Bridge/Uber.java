package Structural.Bridge;

public class Uber extends RidingApps{

    TravelImplementor travelImplementor;

    public Uber(TravelImplementor travelImplementor) {
        this.travelImplementor = travelImplementor;
    }

    @Override
    public void travel() {
        travelImplementor.travel();
    }
}
