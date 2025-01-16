package Structural.Bridge;

public class Rapido extends RidingApps {

    TravelImplementor travelImplementor;

    public Rapido(TravelImplementor travelImplementor) {
        this.travelImplementor = travelImplementor;
    }

    @Override
    public void travel() {
        travelImplementor.travel();
    }
}
