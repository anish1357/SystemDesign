package Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        // Alllows us to define autotravel even if there is no app supporting it
        RidingApps app = new Uber(new AutoTravel());
        RidingApps app2 = new Rapido(new BikeTravel());
        RidingApps app3 = new Rapido(new CabTravel());
        app.travel();
        app2.travel();
        app3.travel();
    }
}
