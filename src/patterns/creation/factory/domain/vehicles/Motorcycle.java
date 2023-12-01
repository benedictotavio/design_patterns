package patterns.creation.factory.domain.vehicles;

public class Motorcycle implements IVehicles {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("start new express!");
    }

    @Override
    public void getCargo() {
        System.out.println("Get the package.");
    }

}
