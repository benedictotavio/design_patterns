package patterns.creation.factory.domain.vehicles;

public class Bicycle implements IVehicles{
    @Override
    public void getCargo() {
        System.out.println("get food package");
    }

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Start new route!");
    }
}
